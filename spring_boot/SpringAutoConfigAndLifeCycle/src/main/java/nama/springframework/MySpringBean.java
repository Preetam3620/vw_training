package nama.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
class MySpringBean implements InitializingBean, DisposableBean, ApplicationContextAware {
	private String message;
	private ApplicationContext ctx;

	public MySpringBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return ("Your Message : " + message);
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}

	public void afterPropertiesSet() {
		System.out.println("after-properties-set init method called..");
	}

	public void destroy() {
		System.out.println("disposable bean interface - destroy method called..");
	}

	public void onInitialize() {
		System.out.println("onInitialize method called.." + ctx.getId());
	}

	public void onDestroy() {
		System.out.println("onDestroy method called.." + ctx.getId());
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("post construct method called..");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("pre destroy method called..");
	}

}
