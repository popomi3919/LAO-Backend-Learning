Les solution au exercise suivant:
  
Exercices sur Optional en Java
1. Créez une méthode Optional<String> getGreeting() qui retourne un Optional contenant un
message de salutation.
- Si le message est null, retournez un Optional.empty().

2. Créez une méthode qui prend un Optional<String> et imprime sa valeur si elle est présente.
- Si la valeur n'est pas présente, imprimez "Aucune valeur présente".

3. Créez une méthode qui retourne un message par défaut si un Optional est vide.
- Comparez l'utilisation de orElse et orElseGet en créant un message complexe dans le orElseGet
(par exemple, en générant un timestamp).

4. Vérification de valeurs avec Optional
- Écrivez une méthode qui prend un Optional<Integer> en entrée et vérifie si l'entier est pair. Si oui,
imprimez-le ; sinon, affichez "Nombre impair ou absent".

5. Utilisation de Optional.map et Optional.flatMap
- Écrivez une méthode qui prend un Optional<String> contenant un prénom, le convertit en
majuscules et retourne un autre Optional<String>.
- Ajoutez un second flatMap pour ajouter "Bonjour" au prénom.
  
6. Utilisation avancée avec Optional.filter- Créez une méthode qui prend un Optional<Integer> et retourne un Optional<Integer> uniquement
si la valeur est supérieure à 10. Sinon, retournez un Optional.empty().
- Testez la méthode avec des valeurs Optional contenant 5, 15 et un Optional.empty().
  
7. Combinaison de plusieurs Optional
- Créez une méthode combineOptionals(Optional<String> firstName, Optional<String> lastName)
qui retourne un Optional<String> contenant le nom complet (firstName + " " + lastName).
- Si l'un des deux Optional est vide, la méthode doit retourner un Optional.empty().

8. Gestion des Exceptions avec Optional
- Créez une méthode qui prend un String représentant un nombre et retourne un Optional<Integer>.
Si la conversion échoue, la méthode doit retourner Optional.empty() sans lever d'exception.

9. Utilisation dans un scénario réel (avec une liste d'utilisateurs)
- Créez une classe User avec des champs id (Long), name (String), et une méthode statique
findById(Long id) qui retourne un Optional<User> à partir d'une liste d'utilisateurs.
- Écrivez une méthode pour afficher le nom d'un utilisateur en utilisant l'ID donné. Si l'utilisateur
n'existe pas, affichez "Utilisateur non trouvé".

10. Travail avec Optional et les streams
- Créez une liste d'entiers. Convertissez la liste en Stream, filtrez les nombres pairs et renvoyez le
premier élément pair en tant qu'Optional.
- Utilisez orElse pour afficher un message si aucun élément pair n'est trouvé.
