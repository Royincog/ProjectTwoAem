package ProjectTwo.core.models;

import javax.inject.Inject;
import javax.mail.Quota.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class myCustomComponent {

	@Inject
	String title;

	public String getTitle() {
		return title;
	}
	
	
}
