Metoda getClass() în Java este o metodă a clasei Object și este folosită pentru a obține obiectul Class asociat cu un obiect la momentul execuției (runtime).
Acest obiect Class conține informații despre clasa din care face parte obiectul, inclusiv numele clasei, pachetul din care face parte, metodele, câmpurile, constructorii și multe altele.

Cum funcționează getClass() la runtime
Când un obiect din Java apelează metoda getClass(), JVM (Java Virtual Machine) returnează o instanță a clasei Class, care reprezintă tipul de obiect.
Aceasta este utilă pentru reflecție (reflection), unde poți afla informații despre clasa unui obiect la runtime, chiar dacă nu cunoști tipul exact al obiectului la compilare.

Explicația exemplului
Crearea unei clase Animal și a unei clase Dog care extinde Animal:

Dog este o subclasă a clasei Animal.
În metoda main:

Se creează un obiect dog de tip Dog.
Se obține clasa obiectului dog folosind dog.getClass(). Aceasta returnează un obiect Class care reprezintă clasa Dog.
Se afișează numele clasei folosind dogClass.getName(), care va afișa Dog.
Se verifică dacă obiectul dog este o instanță a clasei Animal folosind Animal.class.isAssignableFrom(dogClass). Aceasta va returna true, deoarece Dog este o subclasă a clasei Animal.
De ce este util getClass()?
Metoda getClass() este utilă pentru mai multe scenarii, inclusiv:

Reflecție: Poți obține informații detaliate despre structura unui obiect la runtime.
Verificarea tipului: Poți verifica dacă un obiect este de un anumit tip sau moștenește o anumită clasă.
Debugging: Poți afla ce tip de obiect este utilizat în timpul execuției pentru a diagnostica probleme.
Prin urmare, metoda getClass() este un instrument puternic în Java care permite programatorilor să obțină și să utilizeze informații despre tipurile de obiecte la runtime.


https://www.baeldung.com/java-isinstance-isassignablefrom
https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-lang-3



