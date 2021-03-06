package tencent.im.oidb.cmd0x857;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class TroopTips0x857$NotifyObjmsgUpdate
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_ext_msg = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_objmsg_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_update_type = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26 }, new String[] { "bytes_objmsg_id", "uint32_update_type", "bytes_ext_msg" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), localByteStringMicro2 }, NotifyObjmsgUpdate.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x857\TroopTips0x857$NotifyObjmsgUpdate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */