package cooperation.qqreader;

import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hitrate.PreloadProcHitPluginSession;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import cooperation.comic.PluginPreloadReportUtils.HitRateHelper;
import cooperation.comic.PluginPreloadStrategy;
import cooperation.comic.PluginPreloadStrategy.PreloadPublicParam;
import cooperation.comic.PluginPreloadStrategy.PreloadServerParam;
import cooperation.comic.PluginPreloader.ExtraResult;

public class QRProcessManager$QQReaderPreloadLebaStrategy
  extends PluginPreloadStrategy
{
  public final PluginPreloadReportUtils.HitRateHelper a;
  private String d;
  
  public QRProcessManager$QQReaderPreloadLebaStrategy(QRProcessManager paramQRProcessManager, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_d_of_type_JavaLangString = "noreason";
    this.jdField_b_of_type_JavaLangString = "com.tencent.mobileqq:tool";
    this.jdField_a_of_type_Boolean = false;
    this.jdField_c_of_type_JavaLangString = "qqreaderplugin.apk";
    this.jdField_b_of_type_Int = 1;
    this.jdField_c_of_type_Int = paramInt;
    this.jdField_a_of_type_CooperationComicPluginPreloadReportUtils$HitRateHelper = new PluginPreloadReportUtils.HitRateHelper(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
    this.jdField_a_of_type_CooperationComicPluginPreloadReportUtils$HitRateHelper.a = new PreloadProcHitPluginSession("qqreader_leba_preload", "com.tencent.mobileqq:tool", "qqreaderplugin.apk");
  }
  
  protected void a()
  {
    QRProcessManager.a(this.jdField_a_of_type_CooperationQqreaderQRProcessManager, this.jdField_a_of_type_CooperationComicPluginPreloadReportUtils$HitRateHelper, this.jdField_d_of_type_JavaLangString, this.jdField_d_of_type_Int);
  }
  
  protected boolean a(PluginPreloader.ExtraResult paramExtraResult)
  {
    boolean bool = QRProcessManager.a(this.jdField_a_of_type_CooperationQqreaderQRProcessManager);
    if (paramExtraResult != null)
    {
      paramExtraResult.jdField_a_of_type_Int = 2;
      if (!bool) {
        break label66;
      }
    }
    label66:
    for (String str = "preload:ok:dpc";; str = "preload:fail:dpc")
    {
      paramExtraResult.jdField_a_of_type_JavaLangString = str;
      QRProcessManager.a(this.jdField_a_of_type_CooperationQqreaderQRProcessManager);
      if (this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_CooperationComicPluginPreloadStrategy$PreloadServerParam.jdField_b_of_type_Int != -1) {
        this.jdField_a_of_type_Int = this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_CooperationComicPluginPreloadStrategy$PreloadServerParam.jdField_c_of_type_Int;
      }
      return bool;
    }
  }
  
  protected boolean b(PluginPreloader.ExtraResult paramExtraResult)
  {
    boolean bool1;
    if (!this.jdField_a_of_type_CooperationQqreaderQRProcessManager.c)
    {
      if (paramExtraResult != null) {
        paramExtraResult.jdField_a_of_type_JavaLangString = "preload:fail:serverswitch";
      }
      if (QLog.isColorLevel()) {
        QLog.d(QRProcessManager.jdField_a_of_type_JavaLangString, 2, "pluginType:" + this.jdField_b_of_type_Int + "  preload:fail:serverswitch");
      }
      bool1 = false;
    }
    boolean bool2;
    do
    {
      return bool1;
      String str = this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
      bool2 = a(this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_CooperationComicPluginPreloadStrategy$PreloadPublicParam, String.valueOf(769), this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "com.read.android", this.jdField_a_of_type_CooperationQqreaderQRProcessManager.a(str), this.jdField_a_of_type_CooperationQqreaderQRProcessManager.a(str), this.jdField_a_of_type_CooperationQqreaderQRProcessManager.a(str), paramExtraResult);
      this.jdField_d_of_type_JavaLangString = paramExtraResult.jdField_a_of_type_JavaLangString;
      bool1 = bool2;
    } while (this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_CooperationComicPluginPreloadStrategy$PreloadPublicParam == null);
    this.jdField_d_of_type_Int = this.jdField_a_of_type_CooperationQqreaderQRProcessManager.jdField_a_of_type_CooperationComicPluginPreloadStrategy$PreloadPublicParam.jdField_a_of_type_Int;
    return bool2;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qqreader\QRProcessManager$QQReaderPreloadLebaStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */