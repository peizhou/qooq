import android.content.Intent;
import android.os.Bundle;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.vip.DownloadListener;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.mobileqq.vip.IPCDownloadListener;
import com.tencent.mobileqq.vipav.VipFunCallManager;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;

public class wge
  extends DownloadListener
{
  public wge(VipFunCallManager paramVipFunCallManager, String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onDone(DownloadTask paramDownloadTask)
  {
    super.onDone(paramDownloadTask);
    if (QLog.isColorLevel()) {
      QLog.d("VipFunCallManager", 2, "onDone, status=" + paramDownloadTask.a() + ", task.errCode:" + paramDownloadTask.z + ", key=" + paramDownloadTask.jdField_a_of_type_JavaLangString);
    }
    Bundle localBundle = paramDownloadTask.a();
    if (localBundle == null) {
      QLog.e("VipFunCallManager", 1, "mDownloadListener onDone Err0, key:" + paramDownloadTask.jdField_a_of_type_JavaLangString);
    }
    boolean bool;
    label119:
    do
    {
      return;
      if ((paramDownloadTask.a() != 3) || (paramDownloadTask.z != 0)) {
        break;
      }
      bool = true;
      if (!bool) {
        QLog.e("VipFunCallManager", 1, "mDownloadListener onDone fail, task.getStatus():" + paramDownloadTask.a() + ", task.errCode:" + paramDownloadTask.z);
      }
    } while (localBundle.getInt("dealType") == 0);
    int i = localBundle.getInt("callId");
    int j = localBundle.getInt("resourceType");
    Object localObject = localBundle.getString("path");
    if (localBundle.getBoolean("isExists", false)) {}
    for (;;)
    {
      if (!bool) {
        QLog.e("VipFunCallManager", 1, "mDownloadListener onDone rename failure. path:" + (String)localObject);
      }
      if ((localBundle.getBoolean("isIPC")) && (this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener != null))
      {
        localObject = new Bundle();
        ((Bundle)localObject).putInt("fcStatus", 3);
        ((Bundle)localObject).putInt("callId", i);
        ((Bundle)localObject).putInt("srcType", localBundle.getInt("srcType"));
        ((Bundle)localObject).putBoolean("result_boo", bool);
        ((Bundle)localObject).putInt("resourceType", j);
        this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener.a(i, paramDownloadTask.a(), (Bundle)localObject);
      }
      if (9 != VipFunCallManager.a()) {
        break;
      }
      if (QLog.isColorLevel()) {
        QLog.d("VipFunCallManager", 2, "sendBroadcast :tencent.video.q2v.AnnimateDownloadFinish");
      }
      paramDownloadTask = new Intent("tencent.video.q2v.AnnimateDownloadFinish");
      paramDownloadTask.putExtra("fun_call_id", i);
      paramDownloadTask.setPackage(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getPackageName());
      this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().sendBroadcast(paramDownloadTask);
      return;
      bool = false;
      break label119;
      bool = FileUtils.c((String)localObject + ".tmp", (String)localObject);
    }
  }
  
  public void onProgress(DownloadTask paramDownloadTask)
  {
    if (QLog.isColorLevel()) {
      QLog.d("VipFunCallManager", 2, "onProgress, loaded=" + paramDownloadTask.b + "percent=" + paramDownloadTask.jdField_a_of_type_Float + ", key=" + paramDownloadTask.jdField_a_of_type_JavaLangString);
    }
    Bundle localBundle1 = paramDownloadTask.a();
    if (localBundle1 == null) {
      QLog.e("VipFunCallManager", 1, "mDownloadListener onProgress Err0, key:" + paramDownloadTask.jdField_a_of_type_JavaLangString);
    }
    while ((localBundle1.getInt("dealType") == 0) || (!paramDownloadTask.a().getBoolean("isIPC")) || (this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener == null)) {
      return;
    }
    Bundle localBundle2 = new Bundle();
    localBundle2.putInt("fcStatus", 2);
    localBundle2.putInt("callId", localBundle1.getInt("callId"));
    localBundle2.putInt("srcType", localBundle1.getInt("srcType"));
    localBundle2.putInt("progress", (int)paramDownloadTask.jdField_a_of_type_Float);
    localBundle2.putInt("resourceType", localBundle1.getInt("resourceType"));
    this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener.a(localBundle2);
  }
  
  public boolean onStart(DownloadTask paramDownloadTask)
  {
    Bundle localBundle = paramDownloadTask.a();
    if (localBundle == null) {
      QLog.e("VipFunCallManager", 1, "mDownloadListener onStart Err0, key:" + paramDownloadTask.jdField_a_of_type_JavaLangString);
    }
    int i;
    boolean bool;
    do
    {
      do
      {
        return true;
      } while (localBundle.getInt("dealType") == 0);
      i = localBundle.getInt("resourceType");
      bool = localBundle.getBoolean("isIPC");
      if (QLog.isColorLevel()) {
        QLog.d("VipFunCallManager", 2, "onStart, loaded=" + paramDownloadTask.b + ", percent=" + paramDownloadTask.jdField_a_of_type_Float + ", resType=" + i + ", isIPC=" + bool);
      }
    } while ((!bool) || (this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener == null));
    paramDownloadTask = new Bundle();
    paramDownloadTask.putInt("fcStatus", 1);
    paramDownloadTask.putInt("callId", localBundle.getInt("callId"));
    paramDownloadTask.putInt("srcType", localBundle.getInt("srcType"));
    paramDownloadTask.putInt("resourceType", i);
    this.a.jdField_a_of_type_ComTencentMobileqqVipIPCDownloadListener.a(paramDownloadTask);
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */