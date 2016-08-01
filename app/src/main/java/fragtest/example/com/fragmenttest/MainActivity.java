package fragtest.example.com.fragmenttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

/**
 * Created by slience on 2016/8/1.
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener{

    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        //静态添加Fragment
        setContentView(R.layout.main_activity);*/
        //动态添加Fragment
        setContentView(R.layout.add_fragment);
        bt1 = (Button) findViewById(R.id.first);
        bt2 = (Button) findViewById(R.id.second);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                FirstFragment firstFragment = new FirstFragment();
                addFragment(firstFragment);
                break;
            case R.id.second:
                SecondFragment secondFragment = new SecondFragment();
                addFragment(secondFragment);
                break;
        }
    }

    public void addFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_both,fragment);
        fragmentTransaction.commit();
    }

}
