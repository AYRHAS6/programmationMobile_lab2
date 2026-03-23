========================================
  CALCULATEUR D'IMPÔTS LOCAUX - README
========================================
 
DESCRIPTION
-----------
Application Android permettant de calculer les impôts locaux d'un bien
immobilier en fonction de sa surface, du nombre de pièces et de la
présence ou non d'une piscine.
 
FICHIERS Principaux DU PROJET
------------------
- activity_main.xml   : Layout de l'interface utilisateur
- MainActivity.java   : Logique de calcul et gestion des interactions
 
FONCTIONNALITÉS
---------------
- Saisie du nom du propriétaire
- Saisie de l'adresse du bien
- Saisie de la surface de la maison (en m²)
- Saisie du nombre de pièces
- Case à cocher pour indiquer la présence d'une piscine
- Calcul automatique des impôts via un bouton "Calculer"
- Affichage du résultat détaillé (impôt de base + suppléments)
 
FORMULE DE CALCUL
-----------------
  Impôt de base        = Surface (m²) × 2 DH
  Supplément pièces    = Nombre de pièces × 50 DH
  Supplément piscine   = 100 DH (si piscine cochée, sinon 0 DH)
  
  ─────────────────────────────────────────────
  
  TOTAL                = Impôt de base + Supplément pièces + Supplément piscine
 
EXEMPLE
-------
  Surface : 120 m², Pièces : 4, Piscine : Oui
  Impôt de base        = 120 × 2       = 240 DH
  Supplément pièces    = 4 × 50        = 200 DH
  Supplément piscine   =               = 100 DH
  TOTAL                                = 540 DH
 
VALIDATIONS
-----------
- Le champ "Surface" est obligatoire (alerte si vide)
- Le champ "Nombre de pièces" est obligatoire (alerte si vide)
- Les champs numériques n'acceptent que des nombres entiers/décimaux
 
INTERFACE (activity_main.xml)   
------------------------------
  Composants utilisés :
  - LinearLayout (orientation verticale, fond jaune clair #F2EB9E)
  - TextViews      : labels (titre, nom, adresse, surface, pièces)
  - EditTexts      : saisies (nom, adresse, surface, nbrPieces)
  - CheckBox       : présence d'une piscine (id: if_piscine)
  - Button         : bouton "Calculer" 
  - TextView       : affichage du résultat final (id: finalResult)
 
RESSOURCES UTILISÉES (strings.xml)
------------------------------------
  @string/titre  → Titre de l'application
  @string/name   → Label et hint du champ Nom
  @string/add    → Label et hint du champ Adresse
  @string/sur    → Label du champ Surface
  @string/nbr    → Label du champ Nombre de pièces


**APERÇU DE L'APPLICATION**
----------------------------
![1](https://github.com/user-attachments/assets/8d976160-8872-4f3c-bc76-3c80533c6b09)

Si on ne renseigne pas de surface ou nombre de pieces , un toast s'affichera.

![2](https://github.com/user-attachments/assets/09c17f5b-b059-489d-b66b-aaef9a592267)

![3](https://github.com/user-attachments/assets/3f5881fb-3b29-4559-84e4-6b19fe88d3a3)

![4](https://github.com/user-attachments/assets/e7e5ee65-1f97-4530-8cfc-a6dd32b09378)



