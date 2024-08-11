
sorted(Comparator.naturalOrder()): Sortează elementele din flux folosind ordinea naturală a acestora. În cazul șirurilor de caractere,
aceasta înseamnă ordinea alfabetică crescătoare (de la A la Z).
collect(Collectors.toList()): Colectează elementele sortate din flux într-o nouă listă (sortedList).

List<String> sortedList = list.stream()
.sorted(Comparator.naturalOrder())
.collect(Collectors.toList());
sorted((o1, o2) -> o1.compareTo(o2)):


Sortează elementele din flux folosind o expresie lambda care compară două elemente 
(o1 și o2) utilizând metoda compareTo a clasei String. 
Aceasta este echivalentă cu Comparator.naturalOrder() din prima variantă,
și tot sortează elementele în ordinea naturală (alfabetică) a șirurilor de caractere.

        List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o1.compareTo(o2))
			.collect(Collectors.toList());
		
