package com.gamewae.iqra.fragment;

import com.gamewae.iqra.R;
import com.gamewae.iqra.utils.Shared;

import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HintDuaFragment extends Fragment{
	 private View viewroot;
	 @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		 viewroot = inflater.inflate(R.layout.view_hint_dua, container, false);
		 
		 TextView t1 = (TextView)viewroot.findViewById(R.id.txthinttitle);
		 TextView t2 = (TextView)viewroot.findViewById(R.id.txthinttext);
		 
		 t1.setTypeface(Shared.appfont);
		 t2.setTypeface(Shared.appfontLight);
		 return viewroot;
	}
}
