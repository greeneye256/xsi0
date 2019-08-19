
public class XsiO {

    public static void main(String[] args) {

        /* Am inceput prin a vedea daca valorile variabilelor sunt atribuite corect,
        trebuie sa nu fie diferite de X si 0 si trebuie sa fie 5 de x si 4 de 0.

        Am creat 5 variabile de tip int pentru a numara cate x-uri avem, cate 0-uri avem, cate valori gresite avem,
        si mai apoi de cate ori a castigat x-ul(cate linii sau diagonale a facut) si de cate ori a castigat 0-ul.

        Am observat ca, cazul in care jocul este completat total este un pic diferit
        fata de jocul in care se umple pe rand tabelul(cazul in care jocul se poate termina inainte de a se umple complet tabelul).

        Am vazut ca daca o diagonala este castigatoare pentru una dintre valori atunci acea valoare castiga jocul,
        neexistand posibilitatea pentru cealalta de a "recupera", nu mai are loc sa faca o linie sau diagonala.

        Am observat ca 0-ul nu va putea niciodata sa faca 2 winuri adica sa aiba 2 linii sau linie si diagonala sau doua diagonale din cauza ca sunt numai 4 de 0-uri.

        Am observat ca daca x-ul face doua lini sau o linie si o diagonla sau doua diagonale jocul este perfect posibil si aduce victoria x-ului.


         */

        char upLeft = 'X';
        char upMiddle = '0';
        char upRight = '0';
        char middleLeft = 'X';
        char middleMiddle = 'X';
        char middleRight = '0';
        char downLeft = 'X';
        char downMiddle = '0';
        char downRight = 'X';

        int countX=0;
        int countO=0;
        int countWrongParameter=0;
        int xWins = 0;
        int oWins = 0;

        if (upLeft == 'X'){countX++;}
        else {
            if(upLeft =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (upMiddle == 'X'){countX++;}
        else {
            if(upMiddle =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (upRight == 'X' | upRight == 'x'){countX++;}
        else {
            if(upRight =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (middleLeft == 'X'){countX++;}
        else {
            if(middleLeft =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (middleMiddle == 'X'){countX++;}
        else {
            if(middleMiddle =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (middleRight == 'X'){countX++;}
        else {
            if(middleRight =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (downLeft == 'X'){countX++;}
        else {
            if(downLeft =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (downMiddle == 'X'){countX++;}
        else {
            if(downMiddle =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (downRight == 'X'){countX++;}
        else {
            if(downRight =='0'){
                countO++;
            }
            else {
                countWrongParameter++;
            }
        }

        if (countWrongParameter>0){
            if (countWrongParameter==1){
                System.out.println("Ati introdus gresit o valoare. Verificati ca variabilele char sa aiba doar X sau 0");
            }
            else {
                System.out.println("Ati introdus gresit " + countWrongParameter + " valori. Verificati ca variabilele de tip char sa aiba doar X sau 0");
            }
        }
        else {
            if (countX == countO +1 && countX == 5){
                if (upLeft == upMiddle && upMiddle== upRight){
                    if (upLeft == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (middleLeft == middleMiddle && middleMiddle== middleRight){
                    if (middleLeft == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (downLeft == downMiddle && downMiddle== downRight){
                    if (downLeft == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (upLeft == middleLeft && middleLeft== downLeft){
                    if (upLeft == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (upMiddle == middleMiddle && middleMiddle== downMiddle){
                    if (upMiddle == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (upRight == middleRight && middleRight== downRight){
                    if (upRight == 'X'){
                        xWins++;
                    }
                    else {
                        oWins++;
                    }
                }
                if (upLeft == middleMiddle && middleMiddle== downRight){
                    if (upLeft == 'X'){
                        System.out.println("X a castigat!");
                        xWins = 3;
                    }
                    else {
                        System.out.println("0 a castigat!");
                        oWins = 3;
                    }
                }
                if (upRight == middleMiddle && middleMiddle== downLeft){
                    if (upRight == 'X'){
                        System.out.println("X a castigat!");
                        xWins = 3;
                    }
                    else {
                        System.out.println("0 a castigat!");
                        oWins = 3;
                    }
                }
                if (xWins == oWins && xWins == 1){
                    System.out.println("Valorile variabilelor nu sunt corect atribuite, si X si 0 au castigat ceea ce nu ar fi posibil intr-un joc!");
                }
                if (xWins == 2 && oWins == 0){
                    System.out.println("X a castigat!");
                }
                if (xWins == 0 && oWins == 1){
                    System.out.println("0 a castigat!");
                }
                if (xWins == 1 && oWins == 0){
                    System.out.println("X a castigat!");
                }
                if (xWins == 0 && oWins == 0){
                    System.out.println("Remiza!");
                }

            }
            else {
                System.out.println("Numarul de x trebuie sa fie 5 si cel de 0 sa fie 4. Verificati si completati variabilele in consecinta!");
            }

        }

    }

}
