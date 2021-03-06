package com.facebook.imagepipeline.producers;

import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

public class LocalAssetFetchProducer
  extends LocalFetchProducer
{
  @VisibleForTesting
  static final String PRODUCER_NAME = "LocalAssetFetchProducer";
  private final AssetManager mAssetManager;
  
  public LocalAssetFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, AssetManager paramAssetManager, boolean paramBoolean)
  {
    super(paramExecutor, paramPooledByteBufferFactory, paramBoolean);
    this.mAssetManager = paramAssetManager;
  }
  
  private static String getAssetName(ImageRequest paramImageRequest)
  {
    return paramImageRequest.getSourceUri().getPath().substring(1);
  }
  
  /* Error */
  private int getLength(ImageRequest paramImageRequest)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 18	com/facebook/imagepipeline/producers/LocalAssetFetchProducer:mAssetManager	Landroid/content/res/AssetManager;
    //   8: aload_1
    //   9: invokestatic 45	com/facebook/imagepipeline/producers/LocalAssetFetchProducer:getAssetName	(Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;
    //   12: invokevirtual 51	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   15: astore_1
    //   16: aload_1
    //   17: astore_2
    //   18: aload_1
    //   19: astore_3
    //   20: aload_1
    //   21: invokevirtual 56	android/content/res/AssetFileDescriptor:getLength	()J
    //   24: lstore 5
    //   26: lload 5
    //   28: l2i
    //   29: istore 4
    //   31: aload_1
    //   32: ifnull +7 -> 39
    //   35: aload_1
    //   36: invokevirtual 60	android/content/res/AssetFileDescriptor:close	()V
    //   39: iload 4
    //   41: ireturn
    //   42: astore_1
    //   43: aload_2
    //   44: ifnull +7 -> 51
    //   47: aload_2
    //   48: invokevirtual 60	android/content/res/AssetFileDescriptor:close	()V
    //   51: iconst_m1
    //   52: ireturn
    //   53: astore_1
    //   54: aload_3
    //   55: ifnull +7 -> 62
    //   58: aload_3
    //   59: invokevirtual 60	android/content/res/AssetFileDescriptor:close	()V
    //   62: aload_1
    //   63: athrow
    //   64: astore_1
    //   65: iload 4
    //   67: ireturn
    //   68: astore_1
    //   69: goto -18 -> 51
    //   72: astore_2
    //   73: goto -11 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	LocalAssetFetchProducer
    //   0	76	1	paramImageRequest	ImageRequest
    //   3	45	2	localImageRequest1	ImageRequest
    //   72	1	2	localIOException	IOException
    //   1	58	3	localImageRequest2	ImageRequest
    //   29	37	4	i	int
    //   24	3	5	l	long
    // Exception table:
    //   from	to	target	type
    //   4	16	42	java/io/IOException
    //   20	26	42	java/io/IOException
    //   4	16	53	finally
    //   20	26	53	finally
    //   35	39	64	java/io/IOException
    //   47	51	68	java/io/IOException
    //   58	62	72	java/io/IOException
  }
  
  protected EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    return getEncodedImage(this.mAssetManager.open(getAssetName(paramImageRequest), 2), getLength(paramImageRequest));
  }
  
  protected String getProducerName()
  {
    return "LocalAssetFetchProducer";
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\facebook\imagepipeline\producers\LocalAssetFetchProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */