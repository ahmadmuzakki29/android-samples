package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.muzakki.ahmad.material.form.Field;
import com.muzakki.ahmad.material.form.Fields;
import com.muzakki.ahmad.material.form.Form;
import com.muzakki.ahmad.material.form.FormActivity;

public class FormSample extends FormActivity {

    private mForm form;
    private Fields fields;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fields = new Fields();

        Field foto = new Field.Image("profile");
        fields.add(foto);

        Field nama = new Field("nama", Field.Type.TEXT);
        fields.add(nama);

        Field alamat = new Field("alamat", Field.Type.TEXTAREA);
        fields.add(alamat);

        render();
    }


    @Override
    protected Form getForm() {
        if(form==null) form = new mForm(this,fields, Form.SaveType.BOTH, Form.Action.ADD,this);
        return form;
    }

    private class mForm extends Form{

        public mForm(AppCompatActivity act, Fields fields, SaveType saveType, Action action, Listener listener) {
            super(act, fields, saveType, action, listener);
        }
    }
}
