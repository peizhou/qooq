package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.HashMap;
import java.util.Map;

public final class RespAddDiscussMember
  extends JceStruct
{
  static Map cache_AddResult;
  public Map AddResult;
  public long DiscussUin;
  
  public RespAddDiscussMember()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RespAddDiscussMember(long paramLong, Map paramMap)
  {
    this.DiscussUin = paramLong;
    this.AddResult = paramMap;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.DiscussUin = paramJceInputStream.read(this.DiscussUin, 0, true);
    if (cache_AddResult == null)
    {
      cache_AddResult = new HashMap();
      cache_AddResult.put(Long.valueOf(0L), Integer.valueOf(0));
    }
    this.AddResult = ((Map)paramJceInputStream.read(cache_AddResult, 1, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.DiscussUin, 0);
    paramJceOutputStream.write(this.AddResult, 1);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\RespAddDiscussMember.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */