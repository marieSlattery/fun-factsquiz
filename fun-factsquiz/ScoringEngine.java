public class ScoringEngine {
  //for general attention is that you can save and read your scores from different files.
    private Scanner read;
    private PrintWriter write;
    final String scoresFileName = "lbout.txt";
    public void evaluateScores()
    {
        try
        {
            List<Player> playerScores = loadScores();

            Collections.sort(playerScores, Collections.reverseOrder(new PlayerComparator()));

            for (Player player : playerScores)
            {
                System.out.println("\t "+player.getName()+ " " + player.getScore());
            }


            write = new PrintWriter(scoresFileName);

            for (Player player:playerScores)
            {
                write.print(player.getName()+" ");
                final String lineSeparatorKey = "line.separator";     //nice trick to keep code indepentent from platform
                write.println (player.getScore() + System.getProperty(lineSeparatorKey));
            }
            //displayScores();
        }

        catch (InputMismatchException ime)
        {
            System.out.println(ime+": INVALID DATA!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally{        // remember to close all file descriptors or streams
            write.close();
        }
    }

    public List<Player> loadScores()
    {
        List<Player> scores = new ArrayList<Player>();
        FileReader source = null;

        try
        {

            source= new FileReader(scoresFileName);
            read = new Scanner(source);

            while (read.hasNext ())
            {
                Player player = new Player(read.next(),read.nextInt()); // this might throw exception because read.hasNext()
                // check weather only one reading can be made not two ->read.next() and read.nextInt()... |
                // To repair it change format of stored data in your file with scores to keep data for one player in one line...
            }
            return scores;
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println(fnfe+": FILE NOT FOUND!");
        }
        catch (InputMismatchException ime)
        {
            System.out.println(ime+": INVALID DATA!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        } finally{    //remember to close all streams and file descriptors
            assert source != null;
            try {
                read.close();
                source.close();
            } catch (IOException e) {
                System.out.println("PROBLEM WITH CLOSING FILE!");
            }
        }
        return scores;
    }


    private class PlayerComparator implements Comparator<Player>
    {
        public int compare(Player lf1, Player lf2)
        {
            int scoreA = lf1.getScore ();
            int scoreB = lf2.getScore ();

            if (scoreA == scoreB)
            {
                return 0;
            }

            else if (scoreA > scoreB)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }

}