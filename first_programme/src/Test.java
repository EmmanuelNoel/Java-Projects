public class Test {


        /** Le programme commence ici */
       /* public static void main(String[] args) {
            sayHelloTo("world");
        }*/

        /** affiche le message "hello" au destinataire fourni
         *
         * @param recipient
         */
       /* private static void sayHelloTo(String recipient) {
            System.out.println("Hello " + recipient);



        }*/



        /** listez toutes les directions possibles */
        enum Direction {
            north, east, south, west;
        }

        /** trouvez le nord */
        public static void main(String[] args) {
            Direction direction = Direction.north;
            switch (direction) {
                case north:
                    System.out.println("You are heading north");
                    break;
                case east:
                    System.out.println("You are heading east");
                    break;
                case south:
                    System.out.println("You are heading south");
                    break;
                case west:
                    System.out.println("You are heading west");
                    break;
            }
        }


    }

