import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.phonelogin.PhoneNumLoginImpl;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.vaswebviewplugin.VasWebviewUtil;
import java.net.URLEncoder;
import mqq.os.MqqHandler;

public class owa
  implements View.OnClickListener
{
  public owa(BannerManager paramBannerManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (!BannerManager.a(this.a)) {
      return;
    }
    BannerManager.a(this.a, false);
    new Handler().postDelayed(new owb(this), 1000L);
    paramView = (QQAppInterface)BannerManager.a(this.a).getAppRuntime();
    String str = paramView.a();
    Object localObject = new StringBuilder("http://aq.qq.com/cn2/change_psw/mobile/mobile_change_psw_reg_input_psw");
    ((StringBuilder)localObject).append("?");
    ((StringBuilder)localObject).append("uin=");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append("&plat=1");
    ((StringBuilder)localObject).append("&app=1");
    ((StringBuilder)localObject).append("&version=6.5.5.2880");
    ((StringBuilder)localObject).append("&device=" + URLEncoder.encode(Build.DEVICE));
    ((StringBuilder)localObject).append("&system=" + Build.VERSION.RELEASE);
    ((StringBuilder)localObject).append("&systemInt=" + Integer.toString(Build.VERSION.SDK_INT));
    localObject = ((StringBuilder)localObject).toString();
    Intent localIntent = new Intent();
    localIntent.putExtra("portraitOnly", true);
    localIntent.putExtra("url", (String)localObject);
    localIntent.putExtra("uin", str);
    localIntent.putExtra("hide_operation_bar", true);
    localIntent.putExtra("hide_more_button", true);
    VasWebviewUtil.openQQBrowserActivity(BannerManager.a(this.a), (String)localObject, 32768L, localIntent, false, -1);
    PhoneNumLoginImpl.a().a(paramView);
    BannerManager.a(this.a).sendEmptyMessageDelayed(4, 1000L);
    ReportController.b(paramView, "CliOper", "", "", "Mobile_signup", "Clk_blue_pw", 0, 0, "", "", "", "");
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\owa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */