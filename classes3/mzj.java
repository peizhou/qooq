import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.UncommonlyUsedContactsActivity;
import com.tencent.mobileqq.activity.UncommonlyUsedContactsActivity.ListItem;
import com.tencent.mobileqq.adapter.FacePreloadBaseAdapter;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.data.PhoneContact;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.XListView;
import java.util.ArrayList;

public class mzj
  extends FacePreloadBaseAdapter
{
  public mzj(UncommonlyUsedContactsActivity paramUncommonlyUsedContactsActivity, Context paramContext, QQAppInterface paramQQAppInterface, XListView paramXListView, int paramInt, boolean paramBoolean)
  {
    super(paramContext, paramQQAppInterface, paramXListView, paramInt, paramBoolean);
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected Object a(int paramInt)
  {
    return null;
  }
  
  public int getCount()
  {
    return this.a.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.a.a != null) && (paramInt >= 0) && (paramInt < this.a.a.size())) {
      return this.a.a.get(paramInt);
    }
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = (UncommonlyUsedContactsActivity.ListItem)getItem(paramInt);
    View localView;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      paramViewGroup = (mzk)paramView.getTag();
      localView = paramView;
    }
    Object localObject2;
    for (;;)
    {
      paramView = (TextView)localView.findViewById(2131301451);
      localObject2 = localView.findViewById(2131298461);
      if (((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_c_of_type_Int != 0) {
        break;
      }
      ((View)localObject2).setVisibility(8);
      paramView.setVisibility(0);
      paramView.setText(((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_JavaLangString);
      if (AppSetting.j)
      {
        paramView.setFocusable(true);
        paramView.setContentDescription(((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_JavaLangString);
      }
      paramViewGroup.jdField_b_of_type_Int = 0;
      paramViewGroup.jdField_b_of_type_JavaLangString = "";
      paramViewGroup.jdField_a_of_type_Int = paramInt;
      return localView;
      localView = this.a.getLayoutInflater().inflate(2130904115, null);
      paramViewGroup = new mzk(this.a, null);
      paramViewGroup.jdField_d_of_type_AndroidWidgetImageView = ((ImageView)localView.findViewById(2131296790));
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(16908308));
      paramViewGroup.jdField_b_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131299800));
      paramViewGroup.jdField_c_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131301428));
      paramViewGroup.jdField_d_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131301452));
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)localView.findViewById(2131297781));
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
      localView.setTag(paramViewGroup);
    }
    ((View)localObject2).setVisibility(0);
    paramView.setVisibility(8);
    label376:
    int i;
    if ((((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_ComTencentMobileqqPersistenceEntity instanceof Friends))
    {
      localObject1 = (Friends)((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_ComTencentMobileqqPersistenceEntity;
      paramViewGroup.jdField_b_of_type_JavaLangString = ((Friends)localObject1).uin;
      if (!TextUtils.isEmpty(((Friends)localObject1).remark))
      {
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).remark);
        paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setText(null);
        if (AppSetting.j) {
          paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setContentDescription(((Friends)localObject1).remark);
        }
        paramViewGroup.jdField_d_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).recommReason);
        if (((Friends)localObject1).age == 0) {
          break label769;
        }
        paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setText(String.valueOf(((Friends)localObject1).age));
        switch (((Friends)localObject1).gender)
        {
        default: 
          paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setBackgroundResource(2130840973);
          i = 0;
          label416:
          paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
          if ((((Friends)localObject1).age == 0) && (i == 0))
          {
            paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setVisibility(8);
            label450:
            if (AppSetting.j)
            {
              localObject2 = paramViewGroup.jdField_c_of_type_AndroidWidgetTextView;
              if (i != 0) {
                break label823;
              }
              paramView = String.valueOf(((Friends)localObject1).age);
              label476:
              ((TextView)localObject2).setContentDescription(paramView);
              paramViewGroup.jdField_d_of_type_AndroidWidgetTextView.setContentDescription(((Friends)localObject1).recommReason);
            }
            paramViewGroup.jdField_d_of_type_AndroidWidgetImageView.setImageBitmap(a(1, ((Friends)localObject1).uin));
          }
          break;
        }
      }
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_Int = paramInt;
      paramViewGroup.jdField_b_of_type_Int = 1;
      localView.setOnClickListener(this.a);
      return localView;
      if (!TextUtils.isEmpty(((Friends)localObject1).smartRemark))
      {
        if (!TextUtils.isEmpty(((Friends)localObject1).name))
        {
          paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).name);
          label567:
          paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setText("(" + ((Friends)localObject1).smartRemark + ")");
          if (!AppSetting.j) {
            break;
          }
          localObject2 = paramViewGroup.jdField_a_of_type_AndroidWidgetTextView;
          if (!TextUtils.isEmpty(((Friends)localObject1).name)) {
            break label667;
          }
        }
        label667:
        for (paramView = ((Friends)localObject1).uin;; paramView = ((Friends)localObject1).name)
        {
          ((TextView)localObject2).setContentDescription(paramView);
          paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setContentDescription(((Friends)localObject1).smartRemark);
          break;
          paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).uin);
          break label567;
        }
      }
      if (!TextUtils.isEmpty(((Friends)localObject1).name))
      {
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).name);
        label699:
        paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setText(null);
        if (!AppSetting.j) {
          break;
        }
        localObject2 = paramViewGroup.jdField_a_of_type_AndroidWidgetTextView;
        if (!TextUtils.isEmpty(((Friends)localObject1).name)) {
          break label760;
        }
      }
      label760:
      for (paramView = ((Friends)localObject1).uin;; paramView = ((Friends)localObject1).name)
      {
        ((TextView)localObject2).setContentDescription(paramView);
        break;
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((Friends)localObject1).uin);
        break label699;
      }
      label769:
      paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setText(null);
      break label376;
      i = 2130838639;
      paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setBackgroundResource(2130840973);
      break label416;
      i = 2130838634;
      paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setBackgroundResource(2130840962);
      break label416;
      paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setVisibility(0);
      break label450;
      label823:
      if (((Friends)localObject1).gender == 1)
      {
        paramView = "男" + ((Friends)localObject1).age;
        break label476;
      }
      paramView = "女" + ((Friends)localObject1).age;
      break label476;
      if ((((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_ComTencentMobileqqPersistenceEntity instanceof PhoneContact))
      {
        paramView = (PhoneContact)((UncommonlyUsedContactsActivity.ListItem)localObject1).jdField_a_of_type_ComTencentMobileqqPersistenceEntity;
        paramViewGroup.jdField_b_of_type_JavaLangString = paramView.mobileCode;
        paramViewGroup.jdField_c_of_type_Int = 11;
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(paramView.name);
        paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setText(null);
        paramViewGroup.jdField_d_of_type_AndroidWidgetTextView.setText("手动设置");
        if (AppSetting.j)
        {
          paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setContentDescription(paramView.name);
          paramViewGroup.jdField_d_of_type_AndroidWidgetTextView.setContentDescription("手动设置");
        }
        paramViewGroup.jdField_c_of_type_AndroidWidgetTextView.setVisibility(8);
        paramViewGroup.jdField_d_of_type_AndroidWidgetImageView.setImageBitmap(a(paramViewGroup.jdField_b_of_type_JavaLangString, 11, (byte)0));
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */