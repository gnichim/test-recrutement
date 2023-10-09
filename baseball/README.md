# Baseball Players

## Scénario

Une application permet de gérer / afficher des équipes de baseball. D'après les spécifications, chaque équipe doit pouvoir :

- Afficher le **LOGO** de la MLB (Major League of baseball ),
- Afficher **tous les joueurs** sans exception **selon leur position**
- Corriger les bugs
- Améliorer le code

## Indications

- Afficher le **LOGO**
- Positionner les bons accesseurs sur les propriétés des beans
 - Encapsuler correctement la propriété **firstName**
- Utiliser des **interfaces** plutôt que les **implémentations** des objets de type "Collection"
- Mettre en place un héritage pour ajouter le **Manager** _John Farrell_
- Refactoriser les fonctions *getPitchers*, *getOutfields* etc., en utilisant Java 8
- Nettoyer le code superflu (imports, méthodes redondantes...)

## Points d'attention particuliers
- La variable **LOGO** est déclarée "static" mais est initialisée dans un bloc d'instance
- Utilisation de propriétés sans l'utilisation des **accesseurs** (get* / set*) 
 - questionner le candidat sur l'encapsulation
- Résolution d'une boucle infinie
 - L'appel à **toString** _Team_ fait référence à **toString** de _Player_ et génère un cycle sans fin
- Corriger la source de l'exception **ClassCastException** dans _getPitcher / toArray_,
- Dans le **equals** de **Player** on utilise de manière érroné **==** mais celui-ci retourne bien **true** et donc des références identiques!
 - questionner le candidat sur la différence entre **equals** et **==**
- Le **HashSet** de **Team** ne contient qu'un seul élément alors qu'on en ajoute 3, car **equals** et **hashcode** sont mal implémentés
- Questionner le candidat sur l'utilisation d'interfaces plutôt que l'utilisation d'implémentations
- la _JVM_ optimise les chaînes de caractères en les mettant en cache, il peut parfois être nécessaire de créer de nouvelles instances de "String"
- Utilisation de code complexe dans les accesseurs
 - pratique qui risque de lever des exceptions **NullPointerException** dans des accesseurs
 - problématique : est-ce qu'un Bean doit contenir des algorithmes métier
- Aborder le sujet mutable/immutable, via l'utilisation de la méthode **addPlayerToTeam** de **Team**, ainsi que le cycle de vie des instances en mémoire (GC).
- Répétition d'opération **addAPlayerToATeam** dans la méthode "main"
 - plusieurs possibilité de refactoring tels que **while** ou **for**, ou encore l'utilisation de Streams en Java 8
- Présence de code dupliqué dans **getCatchers**, **getPitchers** ... etc
 - interroger le candidat sur l'intérêt d'une classe utilitaire
- Correction de la méthode **extractYear**
 - mauvaise utilisation de la méthode **lastIndexOf**, pour laquelle il manque +1
 - la méthode **trim** peut être utilisée lors de l'extraction de l'année
 - l'objet **Calendar** est plus adapté, ou encore **JodaTime**, ou encore l'API **java.time** en Java 8

## Remarques et sujets de discution
- Constructeur à **4** paramètres
 - l'utilisation d'un Builder est certainement plus pertinente
 - interroger également sur l'utilisation d'un autre patron de conception (factory)
- Explorer les possibilités offertes par les différentes APIs de Java 8,
 - utilisation de l'API **java.time** / **Joda Time**
 - utilisation de **BiFunction**
 - utilisation de **Predicate** pour différencier les types de joueurs (pitchers etc)
- Comment organiser les classes dans différents packages

## Evolutions possibles
- Demander à ce que le **toString()** de **Team** retourne la liste des joueurs, regroupés par type de poste
 - Une solution est de remplacer le **HashSet** par un **TreeSet**, puis d'implémenter l'interface **Comparable** dans la classe **Player**
 - Attention à bien réimplémenter _equals_ et _hashCode_ 
- Possiblité d'ajouter des tests sur la chaine de caractère "null" et sur les valeurs null
