package com.tencent.mobileqq.activity;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.biz.pubaccount.CustomWebView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.qwallet.SendHbActivity;
import com.tencent.mobileqq.activity.qwallet.report.VACDReportUtil;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.ShakeListener;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.Emoticon;
import com.tencent.mobileqq.emosm.Client;
import com.tencent.mobileqq.emosm.DataFactory;
import com.tencent.mobileqq.emosm.web.WebIPCOperator;
import com.tencent.mobileqq.emoticonview.EmoticonUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.util.DisplayUtil;
import com.tencent.mobileqq.utils.AudioUtil;
import com.tencent.qphone.base.util.QLog;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.RenderPriority;
import com.tencent.smtt.sdk.WebViewClient;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Timer;
import lol;
import lom;
import lon;
import loo;
import lop;
import org.json.JSONException;
import org.json.JSONObject;

public class H5MagicPlayerActivity
  extends BaseActivity
{
  public static final String a = "H5MagicPlayerActivity";
  static final String f = "((0))";
  static final String g = "((1))";
  static final String h = "javascript:execGlobalCallback(((0)),((1)))";
  private static final String i = "Meizu_M040";
  float jdField_a_of_type_Float;
  public int a;
  public SoundPool a;
  Vibrator jdField_a_of_type_AndroidOsVibrator;
  CustomWebView jdField_a_of_type_ComTencentBizPubaccountCustomWebView;
  SessionInfo jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo;
  ShakeListener jdField_a_of_type_ComTencentMobileqqAppShakeListener;
  public Emoticon a;
  WebViewClient jdField_a_of_type_ComTencentSmttSdkWebViewClient;
  public boolean a;
  float jdField_b_of_type_Float;
  public int b;
  Emoticon jdField_b_of_type_ComTencentMobileqqDataEmoticon;
  public String b;
  float jdField_c_of_type_Float;
  String jdField_c_of_type_JavaLangString;
  public String d;
  public String e;
  
  public H5MagicPlayerActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_c_of_type_JavaLangString = null;
    this.jdField_a_of_type_Int = -1;
    this.jdField_b_of_type_Int = 0;
    this.jdField_a_of_type_ComTencentMobileqqAppShakeListener = new lop(this);
  }
  
  private JSONObject a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return null;
      if (!paramString.contains("=")) {
        continue;
      }
      paramString = paramString.split("=");
      if ((paramString == null) || (paramString.length < 2))
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("H5MagicPlayerActivity", 2, "jsons = error ");
        return null;
      }
      paramString = paramString[1].split("#");
      if ((paramString == null) || (paramString.length < 2))
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("H5MagicPlayerActivity", 2, "jsons # error ");
        return null;
      }
      String str = paramString[0];
      if (str == null) {
        continue;
      }
      try
      {
        paramString = URLDecoder.decode(str, "UTF-8");
        if (paramString == null) {
          continue;
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        try
        {
          paramString = new JSONObject(paramString);
          if (paramString == null) {
            continue;
          }
          return paramString;
          paramString = paramString;
          if (QLog.isColorLevel()) {
            QLog.d("H5MagicPlayerActivity", 2, "Failed to decode json str, josn=" + str);
          }
          paramString = null;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            if (QLog.isColorLevel()) {
              QLog.d("H5MagicPlayerActivity", 2, "Failed to parse json str,json=");
            }
            paramString = null;
          }
        }
      }
    }
  }
  
  private void a()
  {
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView = new CustomWebView(this);
    FrameLayout localFrameLayout = (FrameLayout)super.findViewById(2131296895);
    localFrameLayout.addView(this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView, 0, new FrameLayout.LayoutParams(-1, -1));
    Button localButton = new Button(this);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(DisplayUtil.a(this, 24.0F), DisplayUtil.a(this, 24.0F));
    localLayoutParams.setMargins(0, DisplayUtil.a(this, 9.0F), DisplayUtil.a(this, 10.0F), 0);
    localLayoutParams.gravity = 53;
    localButton.setLayoutParams(localLayoutParams);
    localButton.setBackgroundDrawable(getResources().getDrawable(2130841739));
    localButton.setOnClickListener(new lol(this));
    localFrameLayout.addView(localButton);
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.setBackgroundColor(0);
    if (this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.getBackground() != null) {
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.getBackground().setAlpha(0);
    }
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.setScrollBarStyle(33554432);
  }
  
  private void a(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "playAudio file dont exist ");
      }
    }
    do
    {
      do
      {
        return;
      } while (this.jdField_a_of_type_Int == -1);
      AudioUtil.a(BaseApplicationImpl.getContext(), true);
      if (this.jdField_a_of_type_AndroidMediaSoundPool == null) {
        this.jdField_a_of_type_AndroidMediaSoundPool = new SoundPool(5, 3, 0);
      }
      this.jdField_b_of_type_Int = this.jdField_a_of_type_AndroidMediaSoundPool.load(localFile.getAbsolutePath(), 1);
      if (this.jdField_b_of_type_Int != 0) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("H5MagicPlayerActivity", 2, "load failure filepath=" + paramString);
    return;
    if (Build.VERSION.SDK_INT >= 8)
    {
      this.jdField_a_of_type_AndroidMediaSoundPool.setOnLoadCompleteListener(new lon(this, paramString));
      return;
    }
    ThreadManager.a().schedule(new loo(this, paramString), 200L);
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "magicCalljs sn is empty");
      }
    }
    do
    {
      return;
      paramString1 = "javascript:execGlobalCallback(((0)),((1)))".replace("((0))", paramString1).replace("((1))", paramString2);
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadUrl(paramString1);
    } while (!QLog.isColorLevel());
    QLog.d("H5MagicPlayerActivity", 2, "magicCalljs calljs = " + paramString1);
  }
  
  private void a(JSONObject paramJSONObject)
  {
    long l = 1000L;
    if (paramJSONObject != null) {}
    for (;;)
    {
      try
      {
        if (paramJSONObject.has("duration"))
        {
          int j = paramJSONObject.getInt("duration");
          l = j;
        }
      }
      catch (Exception paramJSONObject)
      {
        l = 1000L;
        continue;
      }
      if (this.jdField_a_of_type_AndroidOsVibrator == null) {
        this.jdField_a_of_type_AndroidOsVibrator = ((Vibrator)getSystemService("vibrator"));
      }
      if (this.jdField_a_of_type_AndroidOsVibrator != null) {
        this.jdField_a_of_type_AndroidOsVibrator.vibrate(l);
      }
      return;
      l = 1000L;
    }
  }
  
  private void b()
  {
    Object localObject = this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.getSettings();
    ((WebSettings)localObject).setJavaScriptEnabled(true);
    ((WebSettings)localObject).setAllowContentAccess(true);
    ((WebSettings)localObject).setRenderPriority(WebSettings.RenderPriority.HIGH);
    this.jdField_a_of_type_ComTencentSmttSdkWebViewClient = new lom(this);
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.setWebViewClient(this.jdField_a_of_type_ComTencentSmttSdkWebViewClient);
    localObject = Build.MANUFACTURER + "_" + Build.MODEL;
    if ((Build.VERSION.SDK_INT > 10) && (!"Meizu_M040".equals(localObject))) {
      getWindow().addFlags(16777216);
    }
  }
  
  private void b(String paramString)
  {
    this.jdField_b_of_type_JavaLangString = paramString;
    this.jdField_a_of_type_Boolean = true;
    paramString = (SensorManager)getSystemService("sensor");
    paramString.registerListener(this.jdField_a_of_type_ComTencentMobileqqAppShakeListener, paramString.getDefaultSensor(1), 0);
  }
  
  private void b(JSONObject paramJSONObject)
  {
    c(paramJSONObject);
    if (TextUtils.isEmpty(this.jdField_c_of_type_JavaLangString))
    {
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "audioFilePath = null ");
      }
      return;
    }
    a(this.jdField_c_of_type_JavaLangString);
  }
  
  private void c()
  {
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.removeAllViews();
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.destroy();
    g();
    h();
    WebIPCOperator.a().a().doUnbindService(getApplicationContext());
  }
  
  private void c(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "getAudioFilePath json = null ");
      }
    }
    for (;;)
    {
      return;
      try
      {
        if (paramJSONObject.has("file"))
        {
          str = paramJSONObject.getString("file");
          label38:
          if (!paramJSONObject.has("loop")) {
            break label86;
          }
        }
        label86:
        for (int j = paramJSONObject.getInt("loop");; j = -1)
        {
          this.jdField_a_of_type_Int = j;
          if (str != null) {
            break label121;
          }
          if (!QLog.isColorLevel()) {
            break;
          }
          QLog.d("H5MagicPlayerActivity", 2, "playAudio fileName = null ");
          return;
          str = null;
          break label38;
        }
      }
      catch (Exception paramJSONObject)
      {
        String str;
        for (;;)
        {
          this.jdField_a_of_type_Int = -1;
          paramJSONObject.printStackTrace();
          if (QLog.isColorLevel()) {
            QLog.d("H5MagicPlayerActivity", 2, "playAudio json error ");
          }
          str = null;
        }
        label121:
        if (this.jdField_a_of_type_Int == -1)
        {
          if (QLog.isColorLevel()) {
            QLog.d("H5MagicPlayerActivity", 2, "playAudio loop = -1 ");
          }
        }
        else {
          this.jdField_c_of_type_JavaLangString = (EmoticonUtils.p.replace("[epId]", this.jdField_a_of_type_ComTencentMobileqqDataEmoticon.epId) + str);
        }
      }
    }
  }
  
  private void d()
  {
    super.finish();
  }
  
  private void d(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    for (;;)
    {
      return;
      try
      {
        if (paramJSONObject.has("message")) {}
        for (paramJSONObject = paramJSONObject.getString("message"); QLog.isColorLevel(); paramJSONObject = "")
        {
          QLog.d("H5MagicPlayerActivity", 2, "log " + paramJSONObject);
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          paramJSONObject.printStackTrace();
          paramJSONObject = "json parse erro";
        }
      }
    }
  }
  
  private void e()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "openRedPacket:sessionInfo = null ");
      }
      return;
    }
    int j = 0;
    if (this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int == 0) {
      j = 1;
    }
    for (;;)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("recv_uin", this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString);
        localJSONObject.put("recv_type", j);
        if (!TextUtils.isEmpty("")) {
          localJSONObject.put("session_token", "");
        }
        localJSONObject.put("channel", 1);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          Intent localIntent;
          localJSONException.printStackTrace();
        }
      }
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "click HongBao:params=" + localJSONObject.toString());
      }
      localIntent = new Intent(BaseApplicationImpl.getContext(), SendHbActivity.class);
      localIntent.putExtra("come_from", 2);
      localIntent.putExtra("app_info", "appid#1344242394|bargainor_id#1000030201|channel#mobiao");
      localIntent.putExtra("extra_data", localJSONObject.toString());
      localIntent.putExtra("vacreport_key_seq", VACDReportUtil.a(null, "qqwallet", "makeHongbao", "click", "groupType=" + j, 0, null));
      super.startActivity(localIntent);
      ReportController.b(null, "CliOper", "", "", "ep_mall", "0X8005FE5", 0, 0, "", "", "", "");
      return;
      if (this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int == 3000) {
        j = 2;
      } else if (this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int == 1) {
        j = 3;
      }
    }
  }
  
  private void e(JSONObject paramJSONObject)
  {
    int j = -1;
    if (paramJSONObject == null) {
      return;
    }
    try
    {
      if (paramJSONObject.has("click")) {
        j = paramJSONObject.getInt("click");
      }
      ReportController.b(null, "CliOper", "", "", "ep_mall", "itemclick", 0, 0, this.jdField_a_of_type_ComTencentMobileqqDataEmoticon.epId, j + "", "", "");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "reportClick json error");
        }
        paramJSONObject.printStackTrace();
        j = -1;
      }
    }
  }
  
  private void f()
  {
    if (this.jdField_b_of_type_ComTencentMobileqqDataEmoticon != null)
    {
      Object localObject = EmoticonUtils.q.replace("[epId]", this.jdField_b_of_type_ComTencentMobileqqDataEmoticon.epId);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("file://" + (String)localObject);
      localStringBuilder.append("?sender_uin=" + this.d);
      localStringBuilder.append("&self_uin=" + this.e);
      localStringBuilder.append("&auto_play=0");
      localStringBuilder.append("&platform=android");
      localStringBuilder.append("&version=6.5.5");
      localStringBuilder.append("&start_time=" + System.currentTimeMillis());
      localStringBuilder.append("&width=" + this.jdField_b_of_type_Float);
      localStringBuilder.append("&height=" + this.jdField_c_of_type_Float);
      localStringBuilder.append("&pixel_ratio=" + this.jdField_a_of_type_Float);
      localObject = localStringBuilder.toString();
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "reply url = " + (String)localObject);
      }
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadUrl((String)localObject);
      if (WebIPCOperator.a().a())
      {
        localObject = new Bundle();
        ((Bundle)localObject).putSerializable("emoticon", this.jdField_b_of_type_ComTencentMobileqqDataEmoticon);
        ((Bundle)localObject).putParcelable("sessionInfo", this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo);
        localObject = DataFactory.a("ipc_h5magic_sendmsg", "", -1, (Bundle)localObject);
        WebIPCOperator.a().a((Bundle)localObject);
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "send childEmoticon: childEmotcionEpid = " + this.jdField_b_of_type_ComTencentMobileqqDataEmoticon.epId);
        }
        this.jdField_a_of_type_ComTencentMobileqqDataEmoticon = this.jdField_b_of_type_ComTencentMobileqqDataEmoticon;
      }
    }
    for (;;)
    {
      ReportController.b(null, "CliOper", "", "", "ep_mall", "0X8005FE6", 0, 0, "", "", "", "");
      return;
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "send childEmoticon: service not bind");
      }
      d();
      break;
      if (QLog.isColorLevel()) {
        QLog.d("H5MagicPlayerActivity", 2, "reply childemoticon doesnt exit ");
      }
      d();
    }
  }
  
  private void g()
  {
    if (this.jdField_a_of_type_AndroidMediaSoundPool != null)
    {
      AudioUtil.a(BaseApplicationImpl.getContext(), false);
      this.jdField_a_of_type_AndroidMediaSoundPool.stop(this.jdField_b_of_type_Int);
      this.jdField_a_of_type_AndroidMediaSoundPool.release();
    }
  }
  
  private void h()
  {
    this.jdField_a_of_type_Boolean = false;
    ((SensorManager)getSystemService("sensor")).unregisterListener(this.jdField_a_of_type_ComTencentMobileqqAppShakeListener);
  }
  
  public boolean a(String paramString)
  {
    if ((paramString != null) && (paramString.startsWith("jsbridge://")))
    {
      Object localObject1 = paramString.split("/");
      if ((localObject1 == null) || (localObject1.length < 4))
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "url js error : length < 4 js = " + paramString);
        }
        return false;
      }
      if (!"magicEmotion".equals(localObject1[2]))
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "objectName is error ");
        }
        return false;
      }
      Object localObject2 = paramString.split("#");
      if ((localObject2 == null) || (localObject2.length < 2))
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "sn error ");
        }
        return false;
      }
      localObject2 = localObject2[1];
      JSONObject localJSONObject = a(paramString);
      CharSequence localCharSequence = localObject1[3];
      if (TextUtils.isEmpty(localCharSequence))
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "method error ");
        }
        return false;
      }
      localObject1 = "\\?";
      if (!paramString.contains("?")) {
        localObject1 = "#";
      }
      paramString = localCharSequence.split((String)localObject1);
      if ((paramString == null) || (paramString.length < 2))
      {
        if (QLog.isColorLevel()) {
          QLog.d("H5MagicPlayerActivity", 2, "methods error ");
        }
        return false;
      }
      paramString = paramString[0];
      if ("close".equals(paramString)) {
        d();
      }
      for (;;)
      {
        return true;
        if ("openRedPacket".equals(paramString)) {
          e();
        } else if ("reply".equals(paramString)) {
          f();
        } else if ("reportClick".equals(paramString)) {
          e(localJSONObject);
        } else if ("vibrate".equals(paramString)) {
          a(localJSONObject);
        } else if ("playAudio".equals(paramString)) {
          b(localJSONObject);
        } else if ("addShakeEventListener".equals(paramString)) {
          b((String)localObject2);
        } else if ("removeShakeEventListener".equals(paramString)) {
          h();
        } else if ("log".equals(paramString)) {
          d(localJSONObject);
        }
      }
    }
    return false;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.mActNeedImmersive = false;
    super.onCreate(paramBundle);
    super.setContentView(2130904541);
    a();
    b();
    if (!WebIPCOperator.a().a()) {
      WebIPCOperator.a().a().doBindService(getApplicationContext());
    }
    paramBundle = getApplication().getSharedPreferences("h5magic_sp_name", 4);
    if (paramBundle != null) {
      paramBundle.edit().putBoolean("h5magic_sp_isplay_key", true).commit();
    }
    paramBundle = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    this.jdField_a_of_type_Float = paramBundle.density;
    this.jdField_b_of_type_Float = (paramBundle.widthPixels / this.jdField_a_of_type_Float);
    this.jdField_c_of_type_Float = (paramBundle.heightPixels / this.jdField_a_of_type_Float);
    Object localObject = super.getIntent();
    long l = ((Intent)localObject).getLongExtra("clickTime", 0L);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo = ((SessionInfo)((Intent)localObject).getParcelableExtra("sessionInfo"));
    this.jdField_a_of_type_ComTencentMobileqqDataEmoticon = ((Emoticon)((Intent)localObject).getSerializableExtra("emoticon"));
    paramBundle = ((Intent)localObject).getStringExtra("autoPlay");
    this.d = ((Intent)localObject).getStringExtra("senderUin");
    if (((Intent)localObject).hasExtra("childEmoticon")) {
      this.jdField_b_of_type_ComTencentMobileqqDataEmoticon = ((Emoticon)((Intent)localObject).getSerializableExtra("childEmoticon"));
    }
    this.e = ((Intent)localObject).getStringExtra("selfUin");
    localObject = EmoticonUtils.q.replace("[epId]", this.jdField_a_of_type_ComTencentMobileqqDataEmoticon.epId);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("file://" + (String)localObject);
    localStringBuilder.append("?sender_uin=" + this.d);
    localStringBuilder.append("&self_uin=" + this.e);
    localStringBuilder.append("&auto_play=" + paramBundle);
    localStringBuilder.append("&platform=android");
    localStringBuilder.append("&version=6.5.5");
    localStringBuilder.append("&start_time=" + l);
    localStringBuilder.append("&width=" + this.jdField_b_of_type_Float);
    localStringBuilder.append("&height=" + this.jdField_c_of_type_Float);
    localStringBuilder.append("&pixel_ratio=" + this.jdField_a_of_type_Float);
    paramBundle = localStringBuilder.toString();
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadUrl(paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    SharedPreferences localSharedPreferences = getApplication().getSharedPreferences("h5magic_sp_name", 4);
    if (localSharedPreferences != null) {
      localSharedPreferences.edit().putBoolean("h5magic_sp_isplay_key", false).commit();
    }
    c();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\H5MagicPlayerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */