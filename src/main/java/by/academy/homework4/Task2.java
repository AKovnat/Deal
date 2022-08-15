package by.academy.homework4;

public class Task2 {
    public class Body {
        private Heart myHeart;
        private Lungs myLungs;


        public Body() {
            super();
            Heart heart = new Heart();
            this.myHeart = heart;
            Lungs lungs = new Lungs();
            this.myLungs = lungs;
        }

        public void live() {
            myHeart.live();
            myLungs.live();
            System.out.println("You stand on the shore and feel the salty smell of the wind that blows " +
                    "from the sea. And I believe that you are free, and life has only begun.");
        }

        private class Heart {

            public void live() {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    if (i != 0 && (i % 100) == 0) {
                        System.out.println("Knock-knock-knockin' on heaven's door");
                    }
                }

            }

        }

        private class Lungs {
            public void live() {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    if (i != 0 && (i % 50) == 0) {
                        System.out.println("breathe in");
                    }
                    if (i != 0 && (i % 100) == 0) {
                        System.out.println("breathe out");
                    }
                }


            }
        }
    }
}