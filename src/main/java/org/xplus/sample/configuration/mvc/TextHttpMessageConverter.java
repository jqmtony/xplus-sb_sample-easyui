package org.xplus.sample.configuration.mvc;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

//@Component
public class TextHttpMessageConverter extends AbstractHttpMessageConverter<String> {

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	private volatile List<Charset> availableCharsets;

	private boolean writeAcceptCharset = true;

	public TextHttpMessageConverter() {
		// super();
		// TODO Auto-generated constructor stub
		this(DEFAULT_CHARSET);

	}

	public TextHttpMessageConverter(Charset defaultCharset, MediaType... supportedMediaTypes) {
		// super(defaultCharset, supportedMediaTypes);
		// TODO Auto-generated constructor stub
		super(defaultCharset, MediaType.TEXT_HTML, MediaType.ALL);

	}

	public TextHttpMessageConverter(MediaType... supportedMediaTypes) {
		super(supportedMediaTypes);
		// TODO Auto-generated constructor stub
	}

	public TextHttpMessageConverter(MediaType supportedMediaType) {
		super(supportedMediaType);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		// return false;
		return String.class.isAssignableFrom(clazz);
	}

	@Override
	protected String readInternal(Class<? extends String> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		// return null;
		String temp = StreamUtils.copyToString(inputMessage.getBody(),

				Charset.forName("UTF-8"));
		String[] tempArr = temp.split("-");
		return null;
	}

	@Override
	protected void writeInternal(String t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		if (this.writeAcceptCharset) {
			outputMessage.getHeaders().setAcceptCharset(getAcceptedCharsets());
		}
		Charset charset = getContentTypeCharset(outputMessage.getHeaders().getContentType());
		StreamUtils.copy(t, charset, outputMessage.getBody());
	}

	/**
	 * Return the list of supported {@link Charset}s.
	 * <p>
	 * By default, returns {@link Charset#availableCharsets()}. Can be
	 * overridden in subclasses.
	 * 
	 * @return the list of accepted charsets
	 */
	protected List<Charset> getAcceptedCharsets() {
		if (this.availableCharsets == null) {
			this.availableCharsets = new ArrayList<Charset>(Charset.availableCharsets().values());
		}
		return this.availableCharsets;
	}

	private Charset getContentTypeCharset(MediaType contentType) {
		if (contentType != null && contentType.getCharset() != null) {
			return contentType.getCharset();
		} else {
			return getDefaultCharset();
		}
	}

}
