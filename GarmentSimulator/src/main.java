public class main {

    public main(String[] args) { // Corrected parameter type to String[]

        tops t = new tops(); // creating an object for tops as 't'
        pants p = new pants(); // creating an object for pants as 'p'
        shoes s = new shoes(); // creating an object for shoes as 's'

        t.prof(); // calling prof function to show professional top
        t.casual(); // calling casual function to show casual top
        t.party(); // calling party function to show party top

        p.prof(); // calling prof function to show professional pant
        p.casual(); // calling casual function to show casual pant
        p.party(); // calling party function to show party pant

        s.prof(); // calling prof function to show professional shoe
        s.casual(); // calling casual function to show casual shoe
        s.party(); // calling party function to show party shoe
    }
}
