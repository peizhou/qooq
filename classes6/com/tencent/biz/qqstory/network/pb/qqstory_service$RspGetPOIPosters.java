package com.tencent.biz.qqstory.network.pb;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class qqstory_service$RspGetPOIPosters
  extends MessageMicro
{
  public static final int POI_POSTERS_FIELD_NUMBER = 2;
  public static final int RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "result", "poi_posters" }, new Object[] { null, null }, RspGetPOIPosters.class);
  public final PBRepeatMessageField poi_posters = PBField.initRepeatMessage(qqstory_struct.POIPosterData.class);
  public qqstory_struct.ErrorInfo result = new qqstory_struct.ErrorInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\com\tencent\biz\qqstory\network\pb\qqstory_service$RspGetPOIPosters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */