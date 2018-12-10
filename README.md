# 1. semester prøve / programmering

Det er tid til at afprøve det, du lærte igennem første semester på datamatiker-uddannelsen. 

Denne prøve er en milepæl, så du kan se, hvor langt du er nået. Gør dit bedste for at løse opgaverne, og være ikke bang for at løse dem forkert. 

Det er ikke en tragedie, hvis ikke du kan løse alle opgaverne, for du har endnu 2 år til at øve dig på bl.a. programmering.

Men tage dine mangler alvorligt, og lær det, du mangler. Søg evt. hjælp for hos dine undervisere, vi er her for at hjælpe dig at lære. 

## Overordnet tema: TV2

TV2 producerer adskillige tv-indslag med tilhørende billeder og artikler hver dag, og de vil gerne have udviklet et system, som kan give overblik over deres mediefiler.

Du skal hjælpe TV2 med at udvikle et "digital media management system", dvs. et system, som kan holde information om billeder, videoer og nyhedsartikler, der produceres i TV2-regi.

### Opgave 1 - Opstart

Vi har forberedt noget starter-kode, som du skal arbejde med. Fork den fra **[https://github.com/andracs/1sem_exam_2018_B](https://github.com/andracs/1sem_exam_2018_B)**

### Opgave 2 - Velkommen
Programmet starter i Main klassen. Modificer koden således, at den skriver "TV2 Media Manager" i stedet for "Hello World". 

Du kan også konkatenere konstanten SOFTWARE_VERSION fra Main klassen til denne velkomsthilsen.

### Opgave 2 - Klasser og kodeforståelse
Åbn Main-klassen og forstå dens opbygning. Skriv  kommentarer i klassen.

Åbn Media-klassen og forstå dens opbygning.

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
  -- forfætter (navn)
  -- artikeltekst
  -- tilhørende billede 
  

### Opgave - Array, loop og if (eller case) 
Opret en metode med navnet "readMediaFolder(String folderNavn)", som kan indlæse alle filnavne fra "/media" mappen i et array eller ArrayList. Metoden skal returnere denne array eller ArrayList, som indeholder mappens filer. 

Udskriv alle filers navne fra mappen i konsollen.

Opret et medie-objekt for hver indlæst mediefil. (Obs: Gerne det specifikke objekt frem for det generiske.)

### Opgave - Database
Opret en database og en tabel i MySQL, som kan indeholde mediedata. 

Opret en metode, som kan tage et array eller ArrayList med filernes egenskaber som parameter, og som gemmer disse i en database. (Du behøver ikke at gemme alle egenskaber, bare et par stykker, der viser, at du forstår at gemme i database. )

### Opgave - GUI
Design et GUI, som kan vise alle filnavne i mappen. 

Hvis du har  tid, må du gerne udvide din applikation, så medie-data kan rettes i databasen.

Hvis du stadig har tid, kan implementere et preview for alle filer. 
  
### Opgave - Refactoring 
TV2 vil gerne have, at brugernes videoer og billeder skulle også indgå i systemet. Udvid systemet, så den kan skelne mellem bruger-genereret indhold og indhold som er lavet af TV2. 

Skriv i README filen, hvordan du har løst denne opgave, hvad du har gjort. 

### Opgave - Test
Skriv en test, der tester, hvorvidt MediaID's generate() metode altid returnerer en unik ID. 


# Aflvering 
Følgende skal afleveres i Wiseflow:

1. Din projektmappe pakket som zip-fil, inklusiv kommentarer. 
2. Et link til dit projekt på GitHub
3. Et dokument, der via skærmbilleder og forklarende tekst viser, hvordan programmet fungerer. 










## Hint

Prøv at løse opgaven selvstændigt, uden hjælp.  <details><summary>Hvis du har brug for hjælp, klik her.</summary>
<p>

```python
print("hello world!")
```

</p>
</details>

https://github.com/andracs/test
