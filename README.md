# UNO_GAME
IDM


#1)

Il n'existe pas de nombre définis de variantes. En effet chacun peut se créer sa propre variante.

Le FM à été conçu avec FeatureIDE. Vous pourrez le trouver dans le dossier FeatureModel. Il existe 2 types de variantes, les variantes de base (comptage des points, crier 'UNO' ...) et les variantes additionnelles (Uno Mao, superposition +2 / +4)

#2) Conception d'une grammaire xtext simple. exemple:

Uno game test1:

Base: Points - Cry Uno

Variants: Exchange Card - Special Cards: Card Bomb / WildCard: Roulette

J'ai fais le choix de séparer les variantes par des '-' et les sous variantes par des '/'. 



#3) Création d'un schéma JSON à l'aide de https://jsonschema.net/. 
Je suis parti d'un json de base répertoriant toute les variantes retenues :
`{
            "Base": {
                "Points": true,
                "Cry Uno": true,
                "Same color": true,
                "Same number": true
            },
            "variants": {
                "Hand": {
                    "Hands Down": true,
                    "Tree Hands Uno": true
                },
                "Special Card": {
                    "Wild Card": {
                        "ShowDown": true,
                        "Roulette": true
                    },
                    "TimeBomb": true
                },
                "Stacking": {
                    "All cards": true,
                    "All except special cards": true
                },
                "2 players game": true,
                "Uno Mao": true,
                "Exchange Card": true,
                "Suite": true
            }
}`

J'ai fait le choix dans le json schema de ne pas mettre les variantes en "required". Ainsi on peux écrire des json sans obligatoirement mettre la variante (nous pouvons toutefois la mettre à false, voir les exemples dans le dossier JSON). De plus j'ai mis le additionalProperties à false. Empêchant d'ajouter des élements. Vous pourrez observer différentes configurations dans le dossier JSON


#4) 


