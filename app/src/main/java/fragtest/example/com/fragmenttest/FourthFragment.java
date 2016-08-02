package fragtest.example.com.fragmenttest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by slience on 2016/8/2.
 */
public class FourthFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4,container,false);
        if (getArguments() != null) {
            String rec = getArguments().getString("param");
            TextView show = (TextView)view.findViewById(R.id.text_receive);
            show.setText(rec);
        }
        return view;
    }

    public static FourthFragment newInstance(String text) {
        FourthFragment fragment = new FourthFragment();
        Bundle args = new Bundle();
        args.putString("param", text);
        fragment.setArguments(args);
        return fragment;
    }
}
