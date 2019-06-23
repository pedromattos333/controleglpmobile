package senac.com.controleglpmobile.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.control.FuncionarioControl;

public class FuncionarioActivity extends Activity {

    private FuncionarioControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionario);

        control = new FuncionarioControl(this);
    }

    public void chamaTelaCadFunc(View v){
        control.chamaTelaCadFuncAction();
    }

    public void chamaTelaPesqFunc(View v){
        control.chamaTelaPesqFuncAction();
    }

    public void voltar(View v){
        control.voltarAction();
    }
}
