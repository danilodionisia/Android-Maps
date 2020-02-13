package com.example.basicmaps;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConexaoFirebase {

    private static DatabaseReference conexao;

    public static DatabaseReference check (){

        if(conexao == null){
            conexao = FirebaseDatabase.getInstance().getReference();
        }

        return conexao;

    }

}
