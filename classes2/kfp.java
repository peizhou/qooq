import com.tencent.litetransfersdk.LiteTransferWrapper;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class kfp
  implements Runnable
{
  public kfp(LiteTransferWrapper paramLiteTransferWrapper, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (LiteTransferWrapper.access$200(this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper) != 0L) {
      this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper.CancelGroupToJNI(LiteTransferWrapper.access$200(this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper), this.jdField_a_of_type_Int, this.jdField_a_of_type_Long, this.b, this.jdField_a_of_type_Boolean);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\kfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */