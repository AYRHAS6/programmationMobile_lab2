package com.example.calculateurdimptslocaux;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText surfaceMaison, nbrpieces;
    private CheckBox ifpiscine;
    private TextView finalResult;
    private EditText editNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nbrpieces = findViewById(R.id.nbrPieces);
        ifpiscine = findViewById(R.id.if_piscine);
        finalResult = findViewById(R.id.finalResult);
        surfaceMaison = findViewById(R.id.surfacemaison);
        editNom = findViewById(R.id.nom);

        //calculer les impots
        findViewById(R.id.bouttonDeCalcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        String surfaceTexte = surfaceMaison.getText().toString();
        String piecesTexte  = nbrpieces.getText().toString();
        //verifier que les champs de surface et nbr de pieces sont bien remplies
        if (surfaceTexte.isEmpty()) {
            Toast.makeText(this,
                    "Veuillez entrer la surface !",
                    Toast.LENGTH_SHORT).show();
            surfaceMaison.requestFocus();
            return;
        }

        if (piecesTexte.isEmpty()) {
            Toast.makeText(this,
                    "Veuillez entrer le nombre de pièces !",
                    Toast.LENGTH_SHORT).show();
            nbrpieces.requestFocus();
            return;
        }




        double Aire = Double.parseDouble(surfaceMaison.getText().toString());
        int num_pieces = Integer.parseInt(nbrpieces.getText().toString());
        boolean pool = ifpiscine.isChecked();
        String nom = editNom.getText().toString();

        double impotDeBase = Aire * 2;
        double supplement = num_pieces * 50 + (pool ? 100 : 0);
        double total = impotDeBase + supplement;

        // Affichage du résultat final
        finalResult.setText("Bonjour "+nom+"\n*Impôt total : " + total +  "DH\n  *Impots de base "+ impotDeBase +"DH \n *Impots supplementaires "+supplement+"DH");
    }
}