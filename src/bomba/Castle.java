package bomba;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Castle extends javax.swing.JFrame implements Runnable {

    Thread h1, t; 
    int i = 60; 
    static String team, respuesta,scoreS;
    static int cont = 0, score=0;
    

    public Castle() {
        initComponents();
        h1 = new Thread(this);
        setLocationRelativeTo(null);
        jtf_pregunta.setLineWrap(true);
    }

    public void run() {

        Thread ct = Thread.currentThread();
        while (ct == h1) {
            i = i - 1;
            
            
            if(i<=9){
                time.setText("0:0" + i);
            }else{
            time.setText("0:" + i);
            }
            
            // para color de cuadro
            if (i == 59) {
                time.setBackground(Color.green);
            }
            if (i == 20) {
                time.setBackground(Color.orange);
            }
            if (i == 10) {
                time.setBackground(Color.red);
            }

            if (i == 0) {
                time.setText("0:00");
                if(score<5){
                    JOptionPane.showMessageDialog(null,"Terrible. ¡Mejor suerte a la proxima!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }if(score>=5 && score<=8){
                    JOptionPane.showMessageDialog(null,"Ni bien, ni mal. ¡Puedes mejorar!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }if(score>8){
                    JOptionPane.showMessageDialog(null,"Excelente. ¡Sé el mejor siempre!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
    public static void selecc(String tema){
        switch(tema){
            case "matematicas":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Matemáticas");
                team = "matematicas";
                break;
            case "ingles":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Ingles");
                team = "ingles";
                break;
            case "historia": 
                JOptionPane.showMessageDialog(null,"Haz seleccionado Historia");
                team = "historia";
                break;
            case "español":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Español");
                team = "español";
                break;
            case "ciencias":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Ciencias");
                team = "ciencias";
                break;
            case "geografia":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Geografía");
                team = "geografia";
                break;
        }
    }
    static void mat(){
            cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Qué teorema nos dice: 'Él cuadrado de la hipotenusa es igual a la suma de los cuadrados de los catetos'?");
                    jRbtn_a.setText("Teorema de Pitagoras");
                    jRbtn_b.setText("Teorema de Socrates");
                    jRbtn_c.setText("Teorema de Bartolomeo");
                    respuesta = "Teorema de Pitagoras";
                    break;
                case 2:
                    jtf_pregunta.setText("Cuál es el mayor número que se puede escribir con tres 9?");
                    jRbtn_a.setText("999");
                    jRbtn_b.setText("9999");
                    jRbtn_c.setText("Puto el que lo lea :v");
                    respuesta = "999";
                    break;
                case 3: 
                    jtf_pregunta.setText("En un cuarto, en cada esquina hay un gato y cada gato ve tres gatos, ¿cuántos gatos hay en total?");
                    jRbtn_a.setText("4");
                    jRbtn_b.setText("2");
                    jRbtn_c.setText("6");
                    respuesta = "4";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cómo puedes hacer el número 100 con cuatro 9?");
                    jRbtn_a.setText("99+9/9");
                    jRbtn_b.setText("9x9+9-9");
                    jRbtn_c.setText("9/9-99");
                    respuesta = "99+9/9";
                    break;
                case 5:
                    jtf_pregunta.setText("¿2+3+3x11?");
                    jRbtn_a.setText("38");
                    jRbtn_b.setText("35");
                    jRbtn_c.setText("39");
                    respuesta = "38";
                    break;
                case 6:
                    jtf_pregunta.setText("Escribe 13 con cuatro 1");
                    jRbtn_a.setText("11+1+1");
                    jRbtn_b.setText("1+1+1+1");
                    jRbtn_c.setText("1+111");
                    respuesta = "11+1+1";
                    break;
                case 7:
                    jtf_pregunta.setText("Si vas en una moto a 80km/h. ¿Cuánto tiempo tomará llegar a los 80km?");
                    jRbtn_a.setText("1 hora");
                    jRbtn_b.setText("61 minutos");
                    jRbtn_c.setText("1 hora y 1 minuto");
                    respuesta = "1 hora";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Cuál es la raiz cúbica de 8?");
                    jRbtn_a.setText("2");
                    jRbtn_b.setText("1");
                    jRbtn_c.setText("3");
                    respuesta = "2";
                    break;
                case 9:
                    jtf_pregunta.setText("Cuando yo tenía 6 años, mi hermana menor tenía la mitad que yo. Ahora que yo tengo 70 años. ¿Cuántos años tiene mi hermana?");
                    jRbtn_a.setText("67");
                    jRbtn_b.setText("68");
                    jRbtn_c.setText("69");
                    respuesta = "67";
                    break;
                case 10:
                    jtf_pregunta.setText("¿Qué figura geométrica tiene 4 angulos de 90 grados?");
                    jRbtn_a.setText("cuadrado");
                    jRbtn_b.setText("triangulo");
                    jRbtn_c.setText("circulo");
                    respuesta = "cuadrado";
                    break;
            }
    }
    static void ing(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Ing Pregunta 1?");
                    jRbtn_a.setText("respuesta 1");
                    jRbtn_b.setText("respuesta 2");
                    jRbtn_c.setText("Puto el que lo lea :v");
                    respuesta = "respuesta 1";
                    break;
                case 2:
                    jtf_pregunta.setText("Ing Pregunta 2?");
                    jRbtn_a.setText("respuesta 2");
                    jRbtn_b.setText("respuesta 3");
                    jRbtn_c.setText("respuesta 4");
                    respuesta = "respuesta 2";
                    break;
                case 3: 
                    jtf_pregunta.setText("Ing Pregunta 3?");
                    jRbtn_a.setText("respuesta 3");
                    jRbtn_b.setText("respuesta 4");
                    jRbtn_c.setText("respuesta 5");
                    respuesta = "respuesta 3";
                    break;
                case 4:
                    jtf_pregunta.setText("Ing Pregunta 4?");
                    jRbtn_a.setText("respuesta 4");
                    jRbtn_b.setText("respuesta 5");
                    jRbtn_c.setText("respuesta 6");
                    respuesta = "respuesta 4";
                    break;
                case 5:
                    jtf_pregunta.setText("Ing Pregunta 5?");
                    jRbtn_a.setText("respuesta 5");
                    jRbtn_b.setText("respuesta 6");
                    jRbtn_c.setText("respuesta 7");
                    respuesta = "respuesta 5";
                    break;
                case 6:
                    jtf_pregunta.setText("Ing Pregunta 6?");
                    jRbtn_a.setText("respuesta 6");
                    jRbtn_b.setText("respuesta 7");
                    jRbtn_c.setText("respuesta 8");
                    respuesta = "respuesta 6";
                    break;
                case 7:
                    jtf_pregunta.setText("Ing Pregunta 7?");
                    jRbtn_a.setText("respuesta 7");
                    jRbtn_b.setText("respuesta 8");
                    jRbtn_c.setText("respuesta 9");
                    respuesta = "respuesta 7";
                    break;
                case 8:
                    jtf_pregunta.setText("Ing Pregunta 8?");
                    jRbtn_a.setText("respuesta 8");
                    jRbtn_b.setText("respuesta 9");
                    jRbtn_c.setText("respuesta 10");
                    respuesta = "respuesta 8";
                    break;
                case 9:
                    jtf_pregunta.setText("Ing Pregunta 9?");
                    jRbtn_a.setText("respuesta 9");
                    jRbtn_b.setText("respuesta 10");
                    jRbtn_c.setText("respuesta 11");
                    respuesta = "respuesta 9";
                    break;
                case 10:
                    jtf_pregunta.setText("Ing Pregunta 10?");
                    jRbtn_a.setText("respuesta 10");
                    jRbtn_b.setText("respuesta 11");
                    jRbtn_c.setText("respuesta 12");
                    respuesta = "respuesta 10";
                    break;
            }
    }
    static void hist(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿Quién dio el grito de independencia?");
                    jRbtn_a.setText("Miguel Hidalgo");
                    jRbtn_b.setText("Benito Juarez");
                    jRbtn_c.setText("Guadalupe Victoria");
                    respuesta = "Miguel Hidalgo";
                    break;
                case 2:
                    jtf_pregunta.setText("¿Quién dijo la frase: 'El respeto al derecho ajeno es la paz'?");
                    jRbtn_a.setText("Benito Juarez");
                    jRbtn_b.setText("Miguel Hidalgo");
                    jRbtn_c.setText("Puto el que lo lea :v");
                    respuesta = "Benito Juarez";
                    break;
                case 3: 
                    jtf_pregunta.setText("¿Quién fue el primer presidente de México?");
                    jRbtn_a.setText("Guadalupe Victoria");
                    jRbtn_b.setText("Miguel Hidalgo");
                    jRbtn_c.setText("Benito Juarez");
                    respuesta = "Guadalupe Victoria";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cuántos años duro el porfiriato?");
                    jRbtn_a.setText("30 años");
                    jRbtn_b.setText("25 años");
                    jRbtn_c.setText("33 años");
                    respuesta = "30 años";
                    break;
                case 5:
                    jtf_pregunta.setText("¿En qué año inicio la primer guerra mundial?");
                    jRbtn_a.setText("1914");
                    jRbtn_b.setText("1910");
                    jRbtn_c.setText("1920");
                    respuesta = "1914";
                    break;
                case 6:
                    jtf_pregunta.setText("¿Quién fue el lider de los Nazis?");
                    jRbtn_a.setText("Adolf Hitler");
                    jRbtn_b.setText("Juan Perez");
                    jRbtn_c.setText("Lucas Bustamante");
                    respuesta = "Adolf Hitler";
                    break;
                case 7:
                    jtf_pregunta.setText("¿Quién es el actual presidente de México?");
                    jRbtn_a.setText("Enrique Peña Nieto");
                    jRbtn_b.setText("Vicente Fox");
                    jRbtn_c.setText("Felipe Calderón");
                    respuesta = "Enrique Peña Nieto";
                    break;
                case 8:
                    jtf_pregunta.setText("¿En qué año llegó Hernán Cortes a México?");
                    jRbtn_a.setText("1519");
                    jRbtn_b.setText("1923");
                    jRbtn_c.setText("1503");
                    respuesta = "1519";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Qué continente descubrió Cristóbal Colón?");
                    jRbtn_a.setText("1942");
                    jRbtn_b.setText("1923");
                    jRbtn_c.setText("1503");
                    respuesta = "1942";
                    break;
                case 10:
                    jtf_pregunta.setText("¿Quién fue el primer emperador romano?");
                    jRbtn_a.setText("Cesar Augusto");
                    jRbtn_b.setText("Juan Escutia");
                    jRbtn_c.setText("Pedro Barrera");
                    respuesta = "Cesar Augusto";
                    break;
            }
    }
    static void esp(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿En qué silaba llevan el acento tónico las palabras agudas?");
                    jRbtn_a.setText("En la ultima");
                    jRbtn_b.setText("En la penultima");
                    jRbtn_c.setText("Puto el que lo lea :v");
                    respuesta = "En la ultima";
                    break;
                case 2:
                    jtf_pregunta.setText("Es una narración breve de hechos imaginarios o reales, protagonizada por un grupo reducido de personajes y con un argumento sencillo");
                    jRbtn_a.setText("Cuento");
                    jRbtn_b.setText("Mitos");
                    jRbtn_c.setText("Leyendas");
                    respuesta = "Cuento";
                    break;
                case 3: 
                    jtf_pregunta.setText("Son relatos ficticios que se caracterizan por narrar historias");
                    jRbtn_a.setText("Mitos");
                    jRbtn_b.setText("Cuento");
                    jRbtn_c.setText("Leyendas");
                    respuesta = "Mitos";
                    break;
                case 4:
                    jtf_pregunta.setText("Es un relato maravilloso fantástico cuya caracteristica principal es formar parte de la cultura de un pueblo");
                    jRbtn_a.setText("Leyenda");
                    jRbtn_b.setText("Cuento");
                    jRbtn_c.setText("Mitos");
                    respuesta = "Leyenda";
                    break;
                case 5:
                    jtf_pregunta.setText("Es la publicación que se emite diariamente que informa sobre la actualidad");
                    jRbtn_a.setText("Periodico");
                    jRbtn_b.setText("Revista");
                    jRbtn_c.setText("Cartel");
                    respuesta = "Periodico";
                    break;
                case 6:
                    jtf_pregunta.setText("Es la persona por medio de la cual conocemos el relato. La función que cumple es estimular la imaginación e involucrar al lector");
                    jRbtn_a.setText("Narrador");
                    jRbtn_b.setText("Presentador");
                    jRbtn_c.setText("Actor");
                    respuesta = "Narrador";
                    break;
                case 7:
                    jtf_pregunta.setText("Es el modo verbal cuya acción indica orden o mandato");
                    jRbtn_a.setText("Imperativo");
                    jRbtn_b.setText("Negativo");
                    jRbtn_c.setText("Positivo");
                    respuesta = "Imperativo";
                    break;
                case 8:
                    jtf_pregunta.setText("Son publicaciones impresas que contienen textos e imagenes de uno o varios temas, suelen aparecer en un periodo determinado");
                    jRbtn_a.setText("Revistas");
                    jRbtn_b.setText("Periodico");
                    jRbtn_c.setText("Cartel");
                    respuesta = "Revistas";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Cuantas silabas tiene la palabra 'Elefante'?");
                    jRbtn_a.setText("4");
                    jRbtn_b.setText("3");
                    jRbtn_c.setText("5");
                    respuesta = "4";
                    break;
                case 10:
                    jtf_pregunta.setText("Qué es blanco por dentro, verde por fuera. Si quieres que te lo diga, espera");
                    jRbtn_a.setText("Pera");
                    jRbtn_b.setText("Pera negra");
                    jRbtn_c.setText("Pera de africa");
                    respuesta = "Pera";
                    break;
            }
    }
    static void cienc(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Es un resto de un ser vivo que se ha petrificado a travez de los años");
                    jRbtn_a.setText("Fosil");
                    jRbtn_b.setText("Cadaver");
                    jRbtn_c.setText("Cuerpo descompuesto");
                    respuesta = "Fosil";
                    break;
                case 2:
                    jtf_pregunta.setText("Como se llama la ciencia que estudia los fósiles");
                    jRbtn_a.setText("Paleontologia");
                    jRbtn_b.setText("Muertologia");
                    jRbtn_c.setText("Sexologia");
                    respuesta = "Paleontologia";
                    break;
                case 3: 
                    jtf_pregunta.setText("Los seres unicelulares estan conformados por varias celulas. Esta afirmación es verdadera o falsa?");
                    jRbtn_a.setText("Falsa");
                    jRbtn_b.setText("Verdadera");
                    jRbtn_c.setText("Quien sabe");
                    respuesta = "Falsa";
                    break;
                case 4:
                    jtf_pregunta.setText("Los seres pluricelulares estan conformados por varias celulas. Esta afirmación es verdadera o falsa?");
                    jRbtn_a.setText("Verdadera");
                    jRbtn_b.setText("Falsa");
                    jRbtn_c.setText("Quien sabe");
                    respuesta = "Verdadera";
                    break;
                case 5:
                    jtf_pregunta.setText("En que fase la vida aparece la mestruación femenina");
                    jRbtn_a.setText("Pubertad");
                    jRbtn_b.setText("Viejitos");
                    jRbtn_c.setText("Morritos");
                    respuesta = "Pubertad";
                    break;
                case 6:
                    jtf_pregunta.setText("El clima por las noches en el desierto son friolentas. Si o no ?");
                    jRbtn_a.setText("Si");
                    jRbtn_b.setText("No");
                    jRbtn_c.setText("Tal vez");
                    respuesta = "Si";
                    break;
                case 7:
                    jtf_pregunta.setText("El agua, el aire, la luz solar, los minerales, el suelo y la temperatura son elementos?");
                    jRbtn_a.setText("Abioticos");
                    jRbtn_b.setText("Simbioticos");
                    jRbtn_c.setText("Carioticos");
                    respuesta = "Abioticos";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Qué color se obtiene si se mezcla azul con amarillo?");
                    jRbtn_a.setText("Verde");
                    jRbtn_b.setText("Negro");
                    jRbtn_c.setText("Azul");
                    respuesta = "Verde";
                    break;
                case 9:
                    jtf_pregunta.setText("De donde obtenemos la luz durante el dia?");
                    jRbtn_a.setText("Del sol");
                    jRbtn_b.setText("De la luna");
                    jRbtn_c.setText("Del espacio");
                    respuesta = "Del sol";
                    break;
                case 10:
                    jtf_pregunta.setText("Cuántas formas de agregación tiene la materia?");
                    jRbtn_a.setText("3");
                    jRbtn_b.setText("4");
                    jRbtn_c.setText("5");
                    respuesta = "3";
                    break;
            }
    }
    static void geogr(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿Qué nombre se le da a una persona que se va del lugar donde ha vivido?");
                    jRbtn_a.setText("Emigrante");
                    jRbtn_b.setText("Forastero");
                    jRbtn_c.setText("Vagabundo");
                    respuesta = "Emigrante";
                    break;
                case 2:
                    jtf_pregunta.setText("¿Cómo se llaman los recursos que son capaces de regenerarse?");
                    jRbtn_a.setText("Recursos renovables");
                    jRbtn_b.setText("Recursos no renovables");
                    jRbtn_c.setText("Puto el que lo lea :v");
                    respuesta = "Recursos renovables";
                    break;
                case 3: 
                    jtf_pregunta.setText("¿Cuál es la ciudad más poblada del mundo?");
                    jRbtn_a.setText("La ciudad de México");
                    jRbtn_b.setText("Argentina");
                    jRbtn_c.setText("Kanasin");
                    respuesta = "La ciudad de mexico";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cómo se le conoce a las celebraciones y fiestas de un lugar?");
                    jRbtn_a.setText("Tradiciones");
                    jRbtn_b.setText("Costumbres");
                    jRbtn_c.setText("No se");
                    respuesta = "Tradiciones";
                    break;
                case 5:
                    jtf_pregunta.setText("¿Cómo se le llama a la actividad que obtiene directamente los recursos de la naturaleza?");
                    jRbtn_a.setText("Actividades primarias");
                    jRbtn_b.setText("Actividades secundarias");
                    jRbtn_c.setText("Actividades terciarias");
                    respuesta = "Actividades primarias";
                    break;
                case 6:
                    jtf_pregunta.setText("Es conocido como meridiano cero");
                    jRbtn_a.setText("Meridiano de greenwich");
                    jRbtn_b.setText("Meridiano de grechel");
                    jRbtn_c.setText("Meridiano de grecologia");
                    respuesta = "Meridiano de greenwich";
                    break;
                case 7:
                    jtf_pregunta.setText("¿Cuál es la capital de Veracruz?");
                    jRbtn_a.setText("Xalapa");
                    jRbtn_b.setText("Tepito");
                    jRbtn_c.setText("Tangamantapio");
                    respuesta = "Xalapa";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Qué río comparte México con Estados Unidos?");
                    jRbtn_a.setText("Rio bravo");
                    jRbtn_b.setText("Rio manso");
                    jRbtn_c.setText("Rio o no me rio");
                    respuesta = "Rio bravo";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Cuál es el río más largo del mundo?");
                    jRbtn_a.setText("Rio nilo");
                    jRbtn_b.setText("Rio manso");
                    jRbtn_c.setText("Rio o no me rio");
                    respuesta = "Rio nilo";
                    break;
                case 10:
                    jtf_pregunta.setText("Esta es una pregunta de control. Elige tu nombre en la respuesta");
                    jRbtn_a.setText("Tu nombre");
                    jRbtn_b.setText("Arriba");
                    jRbtn_c.setText("Te pasaste mucho");
                    respuesta = "Tu nombre";
                    break;
            }
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBtn_start = new javax.swing.JToggleButton();
        number = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        btn_comprobar = new javax.swing.JButton();
        jlb_pregunta = new javax.swing.JLabel();
        jlb_respuesta = new javax.swing.JLabel();
        jlb_score = new javax.swing.JLabel();
        jtf_score = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_pregunta = new javax.swing.JTextArea();
        btn_next = new javax.swing.JButton();
        jRbtn_a = new javax.swing.JRadioButton();
        jRbtn_b = new javax.swing.JRadioButton();
        jRbtn_c = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTBtn_start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBtn_start.setText("Start");
        jTBtn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtn_startActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number.setText("TIEMPO :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 32)); // NOI18N
        jLabel2.setText("¿Qué tan rápido eres?");

        time.setEditable(false);
        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 30)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setText("1:00");

        btn_comprobar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_comprobar.setText("Check");
        btn_comprobar.setMaximumSize(new java.awt.Dimension(81, 45));
        btn_comprobar.setMinimumSize(new java.awt.Dimension(81, 45));
        btn_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobarActionPerformed(evt);
            }
        });

        jlb_pregunta.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_pregunta.setText("Pregunta:");

        jlb_respuesta.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_respuesta.setText("Respuestas:");

        jlb_score.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_score.setText("Score:");

        jtf_score.setText("0");

        jtf_pregunta.setColumns(20);
        jtf_pregunta.setRows(5);
        jScrollPane1.setViewportView(jtf_pregunta);

        btn_next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        jRbtn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbtn_bActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Jugar de Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Instruciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Ver respuesta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jlb_score)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(number)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlb_pregunta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtf_score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTBtn_start)
                                    .addGap(33, 33, 33)
                                    .addComponent(btn_comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_respuesta)
                            .addComponent(jRbtn_a)
                            .addComponent(jRbtn_b)
                            .addComponent(jRbtn_c))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jtf_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jlb_score)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlb_pregunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_respuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbtn_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbtn_b)
                        .addGap(4, 4, 4)))
                .addComponent(jRbtn_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBtn_start)
                    .addComponent(btn_comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBtn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtn_startActionPerformed
        // TODO add your handling code here:
       run();
       h1.start();
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/bomb (4).png")));
        switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
    }
       
    }//GEN-LAST:event_jTBtn_startActionPerformed

    private void btn_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobarActionPerformed
        // TODO add your handling code here:

        if (jRbtn_a.isSelected()){
            JOptionPane.showMessageDialog(null,"¡Correcto! Siguiente pregunta");
            score++;
            scoreS = String.valueOf(score);
            jtf_score.setText(scoreS);
            jRbtn_a.setText(null);
            jRbtn_a.setSelected(false);
            switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Incorrecto! Sigue intentando");
            jRbtn_b.setSelected(false);
            jRbtn_c.setSelected(false);
        }
        
    }//GEN-LAST:event_btn_comprobarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        menu.main(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Conviertete en el mejor respondiendo todas las preguntas que puedas en menos de un minuto. Ten en cuneta que no podras regresar a alguna pregunta si no la contestaste");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Respuesta: "+respuesta);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
            }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void jRbtn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbtn_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRbtn_bActionPerformed

    
    /**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Castle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comprobar;
    private static javax.swing.JButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private static javax.swing.JRadioButton jRbtn_a;
    private static javax.swing.JRadioButton jRbtn_b;
    private static javax.swing.JRadioButton jRbtn_c;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBtn_start;
    private javax.swing.JLabel jlb_pregunta;
    private javax.swing.JLabel jlb_respuesta;
    private javax.swing.JLabel jlb_score;
    private static javax.swing.JTextArea jtf_pregunta;
    private javax.swing.JTextField jtf_score;
    private javax.swing.JLabel number;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
