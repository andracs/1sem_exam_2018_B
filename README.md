# 1. semester prøve / programmering

Det er tid til at afprøve det, du lærte igennem første semester på datamatiker-uddannelsen. 

Denne prøve er en milepæl, så du kan se, hvor langt du er nået. Gør dit bedste for at løse opgaverne, og være ikke bang for at løse dem forkert. 

Det er ikke en tragedie, hvis ikke du kan løse alle opgaverne, for du har endnu 2 år til at øve dig på bl.a. programmering.

Men tage dine mangler alvorligt, og lær det, du mangler. Søg evt. hjælp for hos dine undervisere, vi er her for at hjælpe dig at lære. 

## Overordnet tema: TV2.dk

TV2.dk producerer adskillige tv-indslag med tilhørende billeder og artikler hver dag, og de vil gerne have udviklet et system, som kan give overblik over deres mediefiler.

Du skal hjælpe TV2 med at udvikle et "digital media management system", dvs. et system, som kan holde information om billeder, videoer og nyhedsartikler, der produceres i TV2-regi.

Der er noget, som alle mediefiler har til fælles, f.eks. at de skal have et navn, en dato, et filnavn og et unikt ID. Andre egenskaber er forbeholdt for de forskellige medietyper, f.eks. er det kun videoer, der har en længde i minutter (duration) 

### Opgave 1 - Opstart

Vi har forberedt noget starter-kode, som du skal arbejde med. Fork den fra **[https://github.com/andracs/1sem_exam_2018_B](https://github.com/andracs/1sem_exam_2018_B)**

### Opgave 2 - Velkommen
Programmet starter i Main klassen. Modificer koden således, at den skriver "TV2 Media Manager" i stedet for "Hello World". 

Du kan også konkatenere konstanten SOFTWARE_VERSION fra Main klassen til denne velkomsthilsen.

### Opgave 2 - Klasser og kodeforståelse
Åbn Main-klassen og forstå dens opbygning. Skriv  kommentarer i klassen.

Åbn Media-klassen og forstå dens opbygning.  Skriv  kommentarer i klassen.

Åbn MediaID klassen, og forstå, hvordan den virker. Din opgave er at skrive kommentarer til alle linjer i denne klasse, og forklare, hvordan den virker. Brug fagsprog.

### Opgave 3 - Nedarvning
Opret 3 nye klasser, som skal repræsentere hhv. billede, video og artikel medietyperne. De skal alle nedarve fra Media klassen og udvide den med følgende klassevariabler:

- __Video__:
  - filtype (mp4, m4v, mov)
  - længde (minutter og sekunder)
  - opløsing (SD, HD)
  - fotograf (navn)
 
- __Billede__:
  - filtype (jpg, png, gif)
  - bredde i pixels
  - højde i pixels
  - fotograf (navn)
 
- __Artikel__
  - forfætter (navn)
  - artikeltekst
  - tilhørende billede 
  

### Opgave - Metoder
Opret en metode ved navnet **logToConsol()** i klassen Media, som skal printe klassens "name" instansvariable  og klassens medietype (i dette tilfælde Media) til consollen.

Override nu denne metode i Video, Billede og Artikel subclasses, så de skriver de respektive medietyper til konsolen i stedet for "Media".

### Opgave - Array, loop og if (eller case) 
Opret en metode med navnet "readMediaFolder(String folderNavn)", som kan indlæse alle filnavne fra "/media" mappen i et array eller ArrayList. Metoden skal returnere denne array eller ArrayList, som indeholder mappens filer. 

Udskriv alle filers navne fra mappen i konsollen.

Opret et medie-objekt for hver indlæst mediefil. (Obs: Gerne det specifikke objekt frem for det generiske.)

### Opgave - Database
Opret en database og en tabel i MySQL, som kan indeholde mediedata. 

Opret en metode, som kan tage et array eller ArrayList med filernes egenskaber som parameter, og som gemmer disse i en database. (Du behøver ikke at gemme alle egenskaber, bare et par stykker, der viser, at du forstår at gemme i database.)

Indtast dummy mediadata, og eksporter din datbase i SQL format, og gem din eksport i projektets SQL mappe. 

### Opgave - GUI
Design et GUI, som kan vise alle filnavne i mappen. 
 
### Opgave - Refactoring 
TV2 vil gerne have, at brugernes videoer og billeder skulle også indgå i systemet. Udvid systemet, så den kan skelne mellem bruger-genereret indhold og indhold som er lavet af TV2. 

Skriv i README filen, hvordan du har løst denne opgave, hvad du har gjort. 

### Opgave - Test
Skriv en test med navnet MediaIDTest, der tester, hvorvidt MediaID's generate() metode altid returnerer en unik, numerisk ID. 


### Opgave - Avanceret
Hvis du har mere tid, kan du også løse følgende opgaver:

Du skal udvide din applikation, så medie-data kan oprettes, rettes og slettes i databasen via GUI'et.

Hvis du stadig har tid, kan du prøve at implementere medievisning i GUI for stationens billede- og videofiler. 
 
# Aflvering 
Følgende skal afleveres i Wiseflow:

1. Din projektmappe pakket som zip-fil, inklusiv kommentarer. 
2. Et link til dit projekt på GitHub, hvor du har Comittet og Pushet alle dine ændringer og tilføjelser!
3. Et dokument, der via skærmbilleder og forklarende tekst viser, hvordan programmet fungerer. 


