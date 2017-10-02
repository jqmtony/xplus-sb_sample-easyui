package org.xplus.sample.configuration.mvc;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * SpringMVC配置<br>
 * <p>
 * 参考资料:<br>
 * http://blog.csdn.net/ht1456749/article/details/47113733<br>
 * http://blog.csdn.net/u010183655/article/details/62226206<br>
 * http://blog.csdn.net/xuqingge/article/details/53561529<br>
 * </p>
 * 
 * @author jqmtony [H]
 *
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	/**
	 * 
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		// ......
		// TextHttpMessageConverter textConverter = new
		// TextHttpMessageConverter();
		// converters.add(textConverter);
		MappingJackson2HttpMessageConverter jackson2Converter = new MappingJackson2HttpMessageConverter();
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		MediaType text_plain = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
		MediaType text_html = new MediaType(MediaType.TEXT_HTML, Charset.forName("UTF-8"));
		// MediaType x_www_form_urlencoded_utf8 = new
		// MediaType(MediaType.APPLICATION_FORM_URLENCODED,Charset.forName("UTF-8"));
		supportedMediaTypes.add(text_html);
		supportedMediaTypes.add(text_plain);
		// supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		// supportedMediaTypes.add(x_www_form_urlencoded_utf8);
		jackson2Converter.setSupportedMediaTypes(supportedMediaTypes);
		// ......
		converters.add(jackson2Converter);
	}

	/**
	 * 
	 */
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TextHttpMessageConverter textConverter = new
		// TextHttpMessageConverter();
		// converters.add(textConverter);
		super.extendMessageConverters(converters);
	}

}
