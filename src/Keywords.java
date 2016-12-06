
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import com.borland.silk.keyworddriven.annotations.Keyword;
import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomTextField;

@RobotKeywords
public class Keywords {

	private Desktop desktop = new Desktop();

	@RobotKeyword
	@Keyword(value = "Start application", isBaseState = true)
	public void start_application() {
		// Go to web page 'http://demo.borland.com/InsuranceWebExtJS/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@RobotKeyword
	@ArgumentNames({"email", "password"})
	@Keyword("Login")
	public void login(String email, String password) {
		desktop.<DomTextField>find("demo_borland_com.BrowserWindow.login-form email").setText(email);
		desktop.<DomTextField>find("demo_borland_com.BrowserWindow.login-form password").setText(password);
		desktop.<DomButton>find("demo_borland_com.BrowserWindow.login-form login").click();
		
	}

	@RobotKeyword
	@Keyword("Go to Auto Quote")
	public void go_to_Auto_Quote() {
		desktop.<DomListBox>find("demo_borland_com.BrowserWindow.quick-link jump-menu").select("Auto Quote");
	}

	@RobotKeyword
	@Keyword("Go to the Homepage")
	public void go_to_the_Homepage() {
		desktop.<DomLink>find("demo_borland_com.BrowserWindow.Home").click();
	}

	@RobotKeyword
	@Keyword("Logout")
	public void logout() {
		desktop.<DomButton>find("demo_borland_com.BrowserWindow.logout-form logout").click();
	}

}