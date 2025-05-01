 📁 **Gestion des Employés - Java (Prosit 9)**

Ce projet est une application Java de gestion des employés réalisée dans le cadre d'un exercice pratique (Prosit 9). Offre la gestion dynamique d'une liste d'employés à l’aide de l’interface `IGestion<T>` et d’une implémentation via `ArrayList`.

🔧 **Fonctionnalités principales :**

- ➕ Ajouter un employé  
- 🔍 Rechercher un employé par nom ou par objet  
- ❌ Supprimer un employé  
- 📃 Afficher la liste des employés  
- 🔢 Trier les employés par ID (`Comparable`)  
- 🗂️ Trier les employés par nom, département et grade (`Comparator`)

📦 **Structure du projet :**

- `Employe` : Classe représentant un employé avec redéfinition de `equals()`, `toString()` et `compareTo()`
- `IGestion<T>` : Interface générique définissant les opérations CRUD et de tri
- `SocieteArrayList` : Implémentation concrète de la gestion des employés via un `ArrayList`
- `EmployeNomComparator`, `EmployeDepartementComparator`, `EmployeGradeComparator` : Comparateurs personnalisés pour un tri avancé
- `Main` : Classe de test pour simuler les opérations sur la société

🚀 **Objectif pédagogique :**

Ce projet vise à mettre en pratique :
- La programmation orientée objet (POO)
- L’utilisation des interfaces génériques en Java
- Les notions de `Comparable` et `Comparator`
- La gestion de collections (`ArrayList`)

 ✅ **Technologies utilisées :**

- Java (JDK 8 ou plus recommandé)
- Collections (ArrayList)
- Interfaces et classes anonymes
- Méthodes redéfinies (`equals`, `toString`, `compareTo`)

---

📁 **Gestion des Départements - Java (Prosit 10)**

Ce module complète la gestion des employés en introduisant une structure pour gérer des départements à l’aide d’une interface générique et d’une implémentation basée sur `HashSet`.

🔧 **Fonctionnalités principales :**

- ➕ Ajouter un département  
- 🔍 Rechercher un département par nom ou par objet  
- ❌ Supprimer un département  
- 📃 Afficher la liste des départements  
- 🔢 Trier les départements par ID (`TreeSet` avec `Comparator`)

📦 **Structure du projet :**

- `Departement` : Classe représentant un département (id, nom, nombre d’employés), avec redéfinition de `equals()` et `toString()`
- `IDepartement<T>` : Interface générique définissant les opérations CRUD et de tri
- `DepartementHashSet` : Implémentation concrète basée sur `HashSet` et `TreeSet`

🚀 **Objectif pédagogique :**

Ce module vise à renforcer :
- La maîtrise des collections (`HashSet`, `TreeSet`)
- La gestion de types génériques
- L’implémentation d’interfaces
- Le tri via `Comparator` personnalisé

  ---
  
  **📁 Gestion des Affectations Employés - Java (Prosit 11)**

Ce module complète la gestion des employés et départements en introduisant la gestion des affectations des employés aux départements à l’aide d’une collection dynamique. L’objectif est de permettre un tri des employés par identifiant, en utilisant une TreeMap pour organiser et afficher les affectations de manière triée, tout en offrant des fonctionnalités d’ajout, de suppression et de recherche des affectations.

**🔧 Fonctionnalités principales :**

➕ Ajouter un employé à un département

🔍 Rechercher les affectations d’un employé ou d’un département

❌ Supprimer une affectation d’un employé

📃 Afficher les affectations des employés aux départements

🔢 Trier les affectations par identifiant d’employé (`TreeMap`)

📦 Structure du projet :

`AffectationHashMap` : Classe permettant de gérer l'affectation des employés à des départements via une collection dynamique (`HashMap`), avec la possibilité de trier les affectations par identifiant grâce à l’utilisation de TreeMap.

`TreeMap<Employe, Departement>` : Utilisation de TreeMap pour trier les employés par identifiant dans le cadre des affectations.

**🚀 Objectif pédagogique :**

Ce module vise à approfondir :

La gestion des relations entre objets dans une application Java, notamment entre les employés et les départements

L’utilisation des collections (`HashMap`, `TreeMap`) pour organiser et trier les données

L'implémentation des méthodes CRUD dans un contexte d’affectation d’employés

