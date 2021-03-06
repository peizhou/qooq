import android.os.Bundle;
import android.os.Message;
import com.tencent.mobileqq.activity.ChatHistoryForC2C;
import com.tencent.mobileqq.activity.messagesearch.C2CMessageSearchDialog;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.MessageRoamManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.utils.MessageRoamHandler;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import mqq.os.MqqHandler;

public class qoj
  extends MessageObserver
{
  private int jdField_a_of_type_Int;
  
  public qoj(MessageRoamHandler paramMessageRoamHandler, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_Int = paramInt;
  }
  
  protected void a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.jdField_a_of_type_Int != this.jdField_a_of_type_Int) {
      return;
    }
    MqqHandler localMqqHandler = this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.b.a(ChatHistoryForC2C.class);
    if (!paramBoolean)
    {
      localMqqHandler.sendMessageDelayed(localMqqHandler.obtainMessage(8), 0L);
      return;
    }
    localMqqHandler.sendMessageDelayed(localMqqHandler.obtainMessage(9), 0L);
  }
  
  protected void b(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.jdField_a_of_type_Int != this.jdField_a_of_type_Int) {
      return;
    }
    MqqHandler localMqqHandler = this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.b.a(ChatHistoryForC2C.class);
    if (!paramBoolean)
    {
      localMqqHandler.sendMessageDelayed(localMqqHandler.obtainMessage(7), 0L);
      return;
    }
    localMqqHandler.sendMessageDelayed(localMqqHandler.obtainMessage(6), 0L);
  }
  
  protected void b(boolean paramBoolean, Object paramObject)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.jdField_a_of_type_Int != this.jdField_a_of_type_Int) {}
    Object localObject;
    long l;
    boolean bool1;
    boolean bool2;
    int j;
    boolean bool3;
    do
    {
      return;
      paramObject = (Bundle)paramObject;
      localObject = ((Bundle)paramObject).getString("PEER_UIN");
      l = ((Bundle)paramObject).getLong("BEGTIME");
      bool1 = ((Bundle)paramObject).getBoolean("NO_MSG");
      i = ((Bundle)paramObject).getInt("SVR_CODE");
      String str = ((Bundle)paramObject).getString("SVR_MSG");
      bool2 = ((Bundle)paramObject).getBoolean("FETCH_MORE");
      j = ((Bundle)paramObject).getInt("MSG_COUNT");
      bool3 = ((Bundle)paramObject).getBoolean("IS_PRELOAD_TYPE");
      if (QLog.isColorLevel()) {
        QLog.d("Q.roammsg", 2, "beginTime: " + l + ",isNoMsg: " + bool1 + ",svrCode: " + i + ",msgCount:" + j + ",fetchMore: " + bool2 + ",svrMsg: " + str + ",isPreloadType:" + bool3);
      }
    } while (bool3);
    if ((paramBoolean) && (bool2) && (j > 0) && (j <= 8))
    {
      ThreadManager.b().post(new qok(this, l, j, (String)localObject, bool2));
      return;
    }
    paramObject = this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.b.a(ChatHistoryForC2C.class);
    int i = 1;
    if (!paramBoolean) {
      if (bool1) {
        i = 2;
      }
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.roammsg", 2, "onUpdateGetRoamChat isSuccess: " + paramBoolean + ", whatMsg: " + i + ", beginTime: " + l);
      }
      localObject = ((MqqHandler)paramObject).obtainMessage(i);
      ((Message)localObject).obj = Long.valueOf(l);
      if (bool2) {}
      for (i = 1;; i = 0)
      {
        ((Message)localObject).arg1 = i;
        ((MqqHandler)paramObject).sendMessageDelayed((Message)localObject, 0L);
        return;
        localObject = (MessageRoamManager)this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.b.getManager(91);
        if ((bool2) || (((MessageRoamManager)localObject).a(l))) {
          break label383;
        }
        i = 4;
        break;
      }
      label383:
      i = 0;
    }
  }
  
  protected void c(boolean paramBoolean, Object paramObject)
  {
    if (paramObject == null) {}
    Object localObject1;
    do
    {
      return;
      localObject2 = (HashMap)paramObject;
      localObject1 = (String)((HashMap)localObject2).get("KEYWORD");
      long l = ((Long)((HashMap)localObject2).get("SEARCHSEQUENCE")).longValue();
      if (QLog.isColorLevel()) {
        QLog.d("Q.roammsg", 2, "onUpdateRoamMsgSearchResult isSuccess:" + paramBoolean + ",keyword:" + (String)localObject1 + ",sequence:" + l);
      }
      localObject1 = this.jdField_a_of_type_ComTencentMobileqqAppUtilsMessageRoamHandler.b.a(C2CMessageSearchDialog.class);
      if (!paramBoolean)
      {
        localObject2 = ((MqqHandler)localObject1).obtainMessage(4);
        ((Message)localObject2).obj = paramObject;
        ((MqqHandler)localObject1).sendMessage((Message)localObject2);
        return;
      }
    } while (((HashMap)localObject2).get("SEARCHRESULT") == null);
    Object localObject2 = ((MqqHandler)localObject1).obtainMessage(5);
    ((Message)localObject2).obj = paramObject;
    ((MqqHandler)localObject1).sendMessage((Message)localObject2);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qoj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */