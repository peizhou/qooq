import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder;
import com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder.StructingMsgViewHolder;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.portal.PortalManager;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;

public class nqb
  implements Runnable
{
  public nqb(StructingMsgItemBuilder paramStructingMsgItemBuilder, StructingMsgItemBuilder.StructingMsgViewHolder paramStructingMsgViewHolder)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    int i = 1;
    if (QLog.isDevelopLevel()) {
      QLog.d("PortalManager", 4, "qiang hong bao lala ......struct msg getView report.........");
    }
    String str2 = "";
    String str1;
    if ((this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$StructingMsgViewHolder.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo != null) && (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$StructingMsgViewHolder.jdField_a_of_type_ComTencentMobileqqDataChatMessage != null)) {
      if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$StructingMsgViewHolder.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int == 1)
      {
        str1 = this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$StructingMsgViewHolder.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString;
        str2 = this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$StructingMsgViewHolder.jdField_a_of_type_ComTencentMobileqqDataChatMessage.senderuin;
      }
    }
    for (;;)
    {
      PortalManager localPortalManager = (PortalManager)this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder.a.getManager(78);
      if (localPortalManager != null) {}
      for (int j = localPortalManager.a();; j = -1)
      {
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder.a, "CliOper", "", "", "0X8004FF9", "0X8004FF9", 0, 0, "" + j, "" + i, "" + str1, str2);
        return;
        i = 2;
        break;
      }
      str1 = "";
      i = 0;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */