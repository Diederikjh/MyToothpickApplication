package com.honeybeeapp.toothpicktest.mytoothpickapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMaker;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMakerFactory;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DaggerCoffeeMakerFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class InnerFragment extends Fragment {

    private static final String LOG_TAG = InnerFragment.class.getName();
//    @Inject
//    IHTTPRequestFactory mRequestFactory1;

    public InnerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inner, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final FragmentActivity activity = getActivity();
//        if (activity != null) {
//            Scope scope = Toothpick.openScopes(activity.getApplication(), activity, this);
//            Toothpick.inject(this, scope);
//            Log.d(LOG_TAG, "Injected");
//        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        doDaggerInjectionFragment(context);
    }

    private void doDaggerInjectionFragment(Context context) {
        CoffeeMakerFactory coffeeMakerFactory = DaggerCoffeeMakerFactory
                .builder()
                .context(context)
                .build();
        CoffeeMaker maker = coffeeMakerFactory.createMaker();
        Log.d(LOG_TAG, "Injection done");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
