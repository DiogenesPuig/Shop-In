/ *
 * Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, elija Herramientas | Plantillas
 * y abra la plantilla en el editor.
 * /
paquete de  tienda ;

import  java.awt.event.ActionEvent ;
import  java.awt.event.ActionListener ;
import  javax.swing.ImageIcon ;
import  javax.swing.JButton ;
import  javax.swing.JOptionPane ;
import  javax.swing.JPasswordField ;
import  javax.swing.JTextField ;

/ **
* @author diogenes
 * /
 Intentando clase  pública extiende javax.swing . JFrame {  

     Usuario público n1;

    / * Crea un nuevo formulario Intentando * /
     Intentando public () {
        una();
    }
    Ropa remera =  nuevo  Ropa ( " m " , " remera " , 500 , 500 , " 333344 " , 0 , falsa );
    Ropa pantalon =  nuevo  Ropa ( " m " , " pantalon " , 500 , 500 , " 334400 " , 0 , falsa );
    Ropa medias =  nueva  Ropa ( " m " , " medias " , 500 , 500 , " 333145 " , 0 , verdadero );
    Ropa campera =  nuevo  Ropa ( " m " , " campera " , 500 , 500 , " 334344 " , 0 , falsa );
    Ropa zapatillas =  nuevo  Ropa ( " 39 " , " zapatillas " , 500 , 500 , " 334414 " , 0 , falsa );
    // --------------------------- Alimentos -------------------- -----------------
    Alimentos carne =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos pollo =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos pescado =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos cerdo =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos tomate =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos papa =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos lechuga =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    Alimentos zanahoria =  nuevos  Alimentos ( " " , " carne " , 100 , 1 , " " , 0 , falso );
    // --------------------------- Limpieza -------------------- -------------------
    Limpieza Papel_Higienico =  nuevo  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Trapo_De_Piso =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Detergente =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Lavandina =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Jabon =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Escoba =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    Limpieza Limpia_Vidrios =  nueva  Limpieza ( 10 , " " , 1 , 1 , " " , 0 , falso );
    
    

    / **
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     * /
    @SuppressWarnings ( " sin marcar " )
    // <editor-fold defaultstate = "collapsed" desc = "Código generado"> // GEN-BEGIN: initComponents
    privado  vacío  initComponents () {

        jLabel5 =  new  javax.swing . JLabel ();
        jPanel58 =  new  javax.swing . JPanel ();
        jLabel127 =  new  javax.swing . JLabel ();
        jButton120 =  new  javax.swing . JButton ();
        jLabel128 =  new  javax.swing . JLabel ();
        jButton121 =  new  javax.swing . JButton ();
        filler10 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel8 =  nuevo  javax.swing . JLabel ();
        jPanel1 =  new  javax.swing . JPanel ();
        lbl_estUs =  new  javax.swing . JLabel ();
        jButton1 =  new  javax.swing . JButton ();
        jTextField1 =  new  javax.swing . JTextField ();
        jPanel2 =  new  javax.swing . JPanel ();
        jLabel2 =  new  javax.swing . JLabel ();
        jLabel3 =  new  javax.swing . JLabel ();
        jLabel4 =  new  javax.swing . JLabel ();
        jLabel6 =  new  javax.swing . JLabel ();
        jLabel7 =  new  javax.swing . JLabel ();
        jScrollPane1 =  new  javax.swing . JScrollPane ();
        jLabel20 =  new  javax.swing . JLabel ();
        jTabbedPane1 =  new  javax.swing . JTabbedPane ();
        jScrollPane2 =  new  javax.swing . JScrollPane ();
        jScrollPane3 =  new  javax.swing . JScrollPane ();
        jPanel39 =  new  javax.swing . JPanel ();
        filler3 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jPanel40 =  new  javax.swing . JPanel ();
        jLabel97 =  nuevo  javax.swing . JLabel ();
        btnRestP =  new  javax.swing . JButton ();
        jLabel99 =  new  javax.swing . JLabel ();
        btnSumP =  new  javax.swing . JButton ();
        jPanel41 =  new  javax.swing . JPanel ();
        jLabel100 =  nuevo  javax.swing . JLabel ();
        btnRestR =  new  javax.swing . JButton ();
        jLabel101 =  new  javax.swing . JLabel ();
        btnSumR =  new  javax.swing . JButton ();
        filler4 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jPanel42 =  new  javax.swing . JPanel ();
        jLabel102 =  new  javax.swing . JLabel ();
        btnRestM =  new  javax.swing . JButton ();
        jLabel103 =  new  javax.swing . JLabel ();
        btnSumM =  new  javax.swing . JButton ();
        jPanel43 =  new  javax.swing . JPanel ();
        jLabel104 =  new  javax.swing . JLabel ();
        btnRestZ =  new  javax.swing . JButton ();
        jLabel105 =  new  javax.swing . JLabel ();
        btnSumZ =  new  javax.swing . JButton ();
        jPanel44 =  new  javax.swing . JPanel ();
        jLabel106 =  new  javax.swing . JLabel ();
        btnRestCm =  new  javax.swing . JButton ();
        jLabel107 =  new  javax.swing . JLabel ();
        btnSumCm =  new  javax.swing . JButton ();
        jScrollPane5 =  new  javax.swing . JScrollPane ();
        jPanel55 =  new  javax.swing . JPanel ();
        filler8 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jPanel57 =  new  javax.swing . JPanel ();
        jLabel125 =  new  javax.swing . JLabel ();
        btnRestC =  new  javax.swing . JButton ();
        jLabel126 =  new  javax.swing . JLabel ();
        btnSumC =  new  javax.swing . JButton ();
        filler9 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel1 =  new  javax.swing . JLabel ();
        jPanel64 =  new  javax.swing . JPanel ();
        jLabel139 =  new  javax.swing . JLabel ();
        jButton132 =  new  javax.swing . JButton ();
        jLabel140 =  new  javax.swing . JLabel ();
        jButton133 =  new  javax.swing . JButton ();
        filler11 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel9 =  nuevo  javax.swing . JLabel ();
        jPanel65 =  new  javax.swing . JPanel ();
        jLabel141 =  new  javax.swing . JLabel ();
        btnRestPl =  new  javax.swing . JButton ();
        jLabel142 =  new  javax.swing . JLabel ();
        btnSumPl =  new  javax.swing . JButton ();
        filler12 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel10 =  nuevo  javax.swing . JLabel ();
        jPanel66 =  new  javax.swing . JPanel ();
        jLabel143 =  new  javax.swing . JLabel ();
        jButton136 =  new  javax.swing . JButton ();
        jLabel144 =  new  javax.swing . JLabel ();
        jButton137 =  new  javax.swing . JButton ();
        filler13 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel11 =  new  javax.swing . JLabel ();
        jPanel67 =  new  javax.swing . JPanel ();
        jLabel145 =  new  javax.swing . JLabel ();
        jButton138 =  new  javax.swing . JButton ();
        jLabel146 =  new  javax.swing . JLabel ();
        jButton139 =  new  javax.swing . JButton ();
        filler14 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel12 =  new  javax.swing . JLabel ();
        jPanel68 =  new  javax.swing . JPanel ();
        jLabel147 =  new  javax.swing . JLabel ();
        jButton140 =  new  javax.swing . JButton ();
        jLabel148 =  new  javax.swing . JLabel ();
        jButton141 =  new  javax.swing . JButton ();
        filler15 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel13 =  new  javax.swing . JLabel ();
        jPanel69 =  new  javax.swing . JPanel ();
        jLabel149 =  new  javax.swing . JLabel ();
        jButton142 =  new  javax.swing . JButton ();
        jLabel150 =  new  javax.swing . JLabel ();
        jButton143 =  new  javax.swing . JButton ();
        filler16 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel14 =  new  javax.swing . JLabel ();
        jPanel70 =  new  javax.swing . JPanel ();
        jLabel151 =  new  javax.swing . JLabel ();
        jButton144 =  new  javax.swing . JButton ();
        jLabel152 =  new  javax.swing . JLabel ();
        jButton145 =  new  javax.swing . JButton ();
        filler17 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel15 =  new  javax.swing . JLabel ();
        jPanel56 =  new  javax.swing . JPanel ();
        filler18 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jPanel59 =  new  javax.swing . JPanel ();
        jLabel129 =  new  javax.swing . JLabel ();
        jButton122 =  new  javax.swing . JButton ();
        jLabel130 =  new  javax.swing . JLabel ();
        jButton123 =  new  javax.swing . JButton ();
        filler19 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel16 =  new  javax.swing . JLabel ();
        jPanel71 =  new  javax.swing . JPanel ();
        jLabel153 =  new  javax.swing . JLabel ();
        jButton146 =  new  javax.swing . JButton ();
        jLabel154 =  new  javax.swing . JLabel ();
        jButton147 =  new  javax.swing . JButton ();
        filler20 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel17 =  new  javax.swing . JLabel ();
        jPanel72 =  new  javax.swing . JPanel ();
        jLabel155 =  new  javax.swing . JLabel ();
        jButton148 =  new  javax.swing . JButton ();
        jLabel156 =  new  javax.swing . JLabel ();
        jButton149 =  new  javax.swing . JButton ();
        filler21 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel18 =  new  javax.swing . JLabel ();
        jPanel73 =  new  javax.swing . JPanel ();
        jLabel157 =  new  javax.swing . JLabel ();
        jButton150 =  new  javax.swing . JButton ();
        jLabel158 =  new  javax.swing . JLabel ();
        jButton151 =  new  javax.swing . JButton ();
        filler22 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel19 =  new  javax.swing . JLabel ();
        jPanel75 =  new  javax.swing . JPanel ();
        jLabel161 =  new  javax.swing . JLabel ();
        jButton154 =  new  javax.swing . JButton ();
        jLabel162 =  new  javax.swing . JLabel ();
        jButton155 =  new  javax.swing . JButton ();
        filler24 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel21 =  new  javax.swing . JLabel ();
        jPanel76 =  new  javax.swing . JPanel ();
        jLabel163 =  new  javax.swing . JLabel ();
        jButton156 =  new  javax.swing . JButton ();
        jLabel164 =  new  javax.swing . JLabel ();
        jButton157 =  new  javax.swing . JButton ();
        filler25 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel22 =  new  javax.swing . JLabel ();
        jPanel77 =  new  javax.swing . JPanel ();
        jLabel165 =  new  javax.swing . JLabel ();
        jButton158 =  new  javax.swing . JButton ();
        jLabel166 =  new  javax.swing . JLabel ();
        jButton159 =  new  javax.swing . JButton ();
        filler26 =  new  javax.swing . Caja . Relleno ( nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 0 , 0 ), nueva  dimensión java.awt . ( 32767 , 0 ));
        jLabel23 =  new  javax.swing . JLabel ();

        jLabel5 . setText ( " Has ahorrado: " );

        jLabel127 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel127 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton120 . setText ( " + " );
        jButton120 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton120ActionPerformed (evt);
            }
        });

        jLabel128 . setText ( " 0 " );

        jButton121 . setText ( " + " );

        jLabel8 . setText ( " $ 500 " );

        javax.swing . GroupLayout jPanel58Layout =  new  javax.swing . GroupLayout (jPanel58);
        jPanel58 . setLayout (jPanel58Layout);
        jPanel58Layout . setHorizontalGroup (
            jPanel58Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel58Layout . createSequentialGroup ()
                .addGroup (jPanel58Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel58Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton120, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel128, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton121, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel58Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel8)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler10, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel58Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel127, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel58Layout . setVerticalGroup (
            jPanel58Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel58Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel127, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel58Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel58Layout . createSequentialGroup ()
                        .addComponent (filler10, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel58Layout . createSequentialGroup ()
                        .addComponent (jLabel8)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel58Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel128, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton121, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton120))))
                .addContainerGap ())
        );

        setDefaultCloseOperation ( javax.swing . WindowConstants . EXIT_ON_CLOSE );
        setMinimumSize ( nueva  dimensión java.awt . ( 800 , 500 ));

        lbl_estUs . setFont ( nueva  fuente java.awt . ( " Diálogo " , 3 , 14 )); // NOI18N
        lbl_estUs . setText ( " Usuario Conectado " );
        lbl_estUs . setHorizontalTextPosition ( javax.swing . SwingConstants . LEADING );

        jButton1 . setFont ( nueva  fuente java.awt . ( " Diálogo " , 3 , 14 )); // NOI18N
        jButton1 . setText ( " Cerrar Sesion " );
        jButton1 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton1ActionPerformed (evt);
            }
        });

        jTextField1 . setText ( " Buscador " );
        jTextField1 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jTextField1ActionPerformed (evt);
            }
        });

        javax.swing . GroupLayout jPanel1Layout =  new  javax.swing . GroupLayout (jPanel1);
        jPanel1 . setLayout (jPanel1Layout);
        jPanel1Layout . setHorizontalGroup (
            jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel1Layout . createSequentialGroup ()
                .addGap ( 23 , 23 , 23 )
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING , false )
                    .addComponent (jButton1, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                    .addComponent (lbl_estUs, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , 158 , Short . MAX_VALUE )
                .addComponent (jTextField1, javax.swing . GroupLayout . PREFERRED_SIZE , 623 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 32 , 32 , 32 ))
        );
        jPanel1Layout . setVerticalGroup (
            jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel1Layout . createSequentialGroup ()
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel1Layout . createSequentialGroup ()
                        .addGap ( 20 , 20 , 20 )
                        .addComponent (lbl_estUs, javax.swing . GroupLayout . PREFERRED_SIZE , 21 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                        .addComponent (jButton1))
                    .addGroup (jPanel1Layout . createSequentialGroup ()
                        .addGap ( 39 , 39 , 39 )
                        .addComponent (jTextField1, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )))
                .addContainerGap ( 12 , Short . MAX_VALUE ))
        );

        jLabel2 . setText ( " 0 " );

        jLabel3 . setFont ( nueva  fuente java.awt . ( " Diálogo " , 3 , 14 )); // NOI18N
        jLabel3 . setText ( " Total: " );

<<<<<< <  CABEZA
        jLabel4 . setHorizontalAlignment ( javax.swing . SwingConstants . CENTER );
        jLabel4 . setText ( " CARRITO " );
====== =
        jLabel4 . setFont ( nueva  fuente java.awt . ( " Diálogo " , 3 , 14 )); // NOI18N
        jLabel4 . setText ( " Carrito " );
>>>>>> > 1fa71624ef64c8bfc82c7527959346db3f82f56b

        jLabel6 . setFont ( nueva  fuente java.awt . ( " Diálogo " , 3 , 14 )); // NOI18N
        jLabel6 . setText ( " Ahorrado: " );
        jLabel6 . setMaximumSize ( nueva  dimensión java.awt . ( 45 , 15 ));
        jLabel6 . setMinimumSize ( nueva  dimensión java.awt . ( 45 , 15 ));

        jLabel7 . setText ( " 0 " );

        jLabel20 . setText ( " jLabel20 " );
        jScrollPane1 . setViewportView (jLabel20);

        javax.swing . GroupLayout jPanel2Layout =  new  javax.swing . GroupLayout (jPanel2);
        jPanel2 . setLayout (jPanel2Layout);
        jPanel2Layout . setHorizontalGroup (
            jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addComponent (jLabel4, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
            .addGroup (jPanel2Layout . createSequentialGroup ()
                .addContainerGap ()
                .addGroup (jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel2Layout . createSequentialGroup ()
                        .addComponent (jLabel3, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel2, javax.swing . GroupLayout . PREFERRED_SIZE , 51 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 100 , 100 , 100 ))
                    .addGroup (jPanel2Layout . createSequentialGroup ()
                        .addGroup (jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING , false )
                            .addComponent (jScrollPane1, javax.swing . GroupLayout . PREFERRED_SIZE , 223 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel2Layout . createSequentialGroup ()
                                .addComponent (jLabel6, javax.swing . GroupLayout . PREFERRED_SIZE , 106 , javax.swing . GroupLayout . PREFERRED_SIZE )
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                                .addComponent (jLabel7, javax.swing . GroupLayout . PREFERRED_SIZE , 52 , javax.swing . GroupLayout . PREFERRED_SIZE )))
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))))
        );
        jPanel2Layout . setVerticalGroup (
            jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel2Layout . createSequentialGroup ()
                .addComponent (jLabel4, javax.swing . GroupLayout . PREFERRED_SIZE , 47 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jScrollPane1, javax.swing . GroupLayout . DEFAULT_SIZE , 267 , Short . MAX_VALUE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jLabel7)
                    .addComponent (jLabel6, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel2Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel2)
                    .addComponent (jLabel3))
                .addContainerGap ())
        );

        jTabbedPane1 . setToolTipText ( " ROPA " );
        jTabbedPane1 . setName ( " " ); // NOI18N

        jLabel97 . setText ( " $ 800 " );
        jLabel97 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel97 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestP . setText ( " - " );

        jLabel99 . setText ( " 0 " );

        btnSumP . setText ( " + " );

        javax.swing . GroupLayout jPanel40Layout =  new  javax.swing . GroupLayout (jPanel40);
        jPanel40 . setLayout (jPanel40Layout);
        jPanel40Layout . setHorizontalGroup (
            jPanel40Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel40Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addComponent (btnRestP, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jLabel99, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (btnSumP, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel40Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel97, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel40Layout . setVerticalGroup (
            jPanel40Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel40Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel97, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel40Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel99, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnSumP, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnRestP))
                .addContainerGap ())
        );

        jLabel100 . setText ( " $ 500 " );
        jLabel100 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel100 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestR . setText ( " - " );
        btnRestR . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btnRestRActionPerformed (evt);
            }
        });

        jLabel101 . setText ( " 0 " );

        btnSumR . setText ( " + " );

        javax.swing . GroupLayout jPanel41Layout =  new  javax.swing . GroupLayout (jPanel41);
        jPanel41 . setLayout (jPanel41Layout);
        jPanel41Layout . setHorizontalGroup (
            jPanel41Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel41Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addComponent (btnRestR, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jLabel101, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (btnSumR, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (filler4, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel41Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel100, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel41Layout . setVerticalGroup (
            jPanel41Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel41Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel100, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGroup (jPanel41Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel41Layout . createSequentialGroup ()
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel41Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel101, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnSumR, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnRestR))
                        .addContainerGap ())
                    .addGroup (jPanel41Layout . createSequentialGroup ()
                        .addGap ( 18 , 18 , 18 )
                        .addComponent (filler4, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))))
        );

        jLabel102 . setText ( " $ 100 " );
        jLabel102 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel102 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestM . setText ( " - " );
        btnRestM . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btnRestMActionPerformed (evt);
            }
        });

        jLabel103 . setText ( " 0 " );

        btnSumM . setText ( " + " );

        javax.swing . GroupLayout jPanel42Layout =  new  javax.swing . GroupLayout (jPanel42);
        jPanel42 . setLayout (jPanel42Layout);
        jPanel42Layout . setHorizontalGroup (
            jPanel42Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel42Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addComponent (btnRestM, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jLabel103, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (btnSumM, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel42Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel102, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel42Layout . setVerticalGroup (
            jPanel42Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel42Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel102, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel42Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel103, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnSumM, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnRestM))
                .addContainerGap ())
        );

        jLabel104 . setText ( " $ 900 " );
        jLabel104 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel104 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestZ . setText ( " - " );

        jLabel105 . setText ( " 0 " );

        btnSumZ . setText ( " + " );

        javax.swing . GroupLayout jPanel43Layout =  new  javax.swing . GroupLayout (jPanel43);
        jPanel43 . setLayout (jPanel43Layout);
        jPanel43Layout . setHorizontalGroup (
            jPanel43Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel43Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addComponent (btnRestZ, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jLabel105, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (btnSumZ, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel43Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel104, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel43Layout . setVerticalGroup (
            jPanel43Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel43Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel104, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel43Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel105, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnSumZ, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnRestZ))
                .addContainerGap ())
        );

        jLabel106 . setText ( " $ 1600 " );
        jLabel106 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel106 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestCm . setText ( " - " );

        jLabel107 . setText ( " 0 " );

        btnSumCm . setText ( " + " );

        javax.swing . GroupLayout jPanel44Layout =  new  javax.swing . GroupLayout (jPanel44);
        jPanel44 . setLayout (jPanel44Layout);
        jPanel44Layout . setHorizontalGroup (
            jPanel44Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel44Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addComponent (btnRestCm, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jLabel107, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (btnSumCm, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel44Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel106, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel44Layout . setVerticalGroup (
            jPanel44Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel44Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel106, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel44Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel107, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnSumCm, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnRestCm))
                .addContainerGap ())
        );

        javax.swing . GroupLayout jPanel39Layout =  new  javax.swing . GroupLayout (jPanel39);
        jPanel39 . setLayout (jPanel39Layout);
        jPanel39Layout . setHorizontalGroup (
            jPanel39Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel39Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel39Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel43, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addGroup (jPanel39Layout . createSequentialGroup ()
                        .addComponent (jPanel41, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jPanel40, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jPanel42, javax.swing . GroupLayout . PREFERRED_SIZE , 162 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jPanel44, javax.swing . GroupLayout . PREFERRED_SIZE , 164 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                        .addComponent (filler3, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )))
                .addGap ( 27 , 27 , 27 ))
        );
        jPanel39Layout . setVerticalGroup (
            jPanel39Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel39Layout . createSequentialGroup ()
                .addGap ( 139 , 139 , 139 )
                .addComponent (filler3, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( 493 , Short . MAX_VALUE ))
            .addGroup (jPanel39Layout . createSequentialGroup ()
                .addGroup (jPanel39Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                    .addComponent (jPanel44, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel42, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel40, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel41, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jPanel43, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 0 , 0 , Corto . MAX_VALUE ))
        );

        jScrollPane3 . setViewportView (jPanel39);

        jScrollPane2 . setViewportView (jScrollPane3);

        jTabbedPane1 . addTab ( " ROPA " , jScrollPane2);

        jLabel125 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel125 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestC . setText ( " + " );
        btnRestC . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btnRestCActionPerformed (evt);
            }
        });

        jLabel126 . setText ( " 0 " );

        btnSumC . setText ( " + " );

        jLabel1 . setText ( " $ 500 " );

        javax.swing . GroupLayout jPanel57Layout =  new  javax.swing . GroupLayout (jPanel57);
        jPanel57 . setLayout (jPanel57Layout);
        jPanel57Layout . setHorizontalGroup (
            jPanel57Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel57Layout . createSequentialGroup ()
                .addGroup (jPanel57Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel57Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (btnRestC, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel126, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (btnSumC, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel57Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel1)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler9, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel57Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel125, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel57Layout . setVerticalGroup (
            jPanel57Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel57Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel125, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel57Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel57Layout . createSequentialGroup ()
                        .addComponent (filler9, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel57Layout . createSequentialGroup ()
                        .addComponent (jLabel1)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel57Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel126, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnSumC, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnRestC))))
                .addContainerGap ())
        );

        jLabel139 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel139 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton132 . setText ( " + " );
        jButton132 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton132ActionPerformed (evt);
            }
        });

        jLabel140 . setText ( " 0 " );

        jButton133 . setText ( " + " );

        jLabel9 . setText ( " $ 130 " );

        javax.swing . GroupLayout jPanel64Layout =  new  javax.swing . GroupLayout (jPanel64);
        jPanel64 . setLayout (jPanel64Layout);
        jPanel64Layout . setHorizontalGroup (
            jPanel64Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel64Layout . createSequentialGroup ()
                .addGroup (jPanel64Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel64Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton132, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel140, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton133, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel64Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel9)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler11, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel64Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel139, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel64Layout . setVerticalGroup (
            jPanel64Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel64Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel139, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel64Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel64Layout . createSequentialGroup ()
                        .addComponent (filler11, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel64Layout . createSequentialGroup ()
                        .addComponent (jLabel9)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel64Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel140, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton133, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton132))))
                .addContainerGap ())
        );

        jLabel141 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel141 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        btnRestPl . setText ( " + " );
        btnRestPl . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btnRestPlActionPerformed (evt);
            }
        });

        jLabel142 . setText ( " 0 " );

        btnSumPl . setText ( " + " );

        jLabel10 . setText ( " $ 490 " );

        javax.swing . GroupLayout jPanel65Layout =  new  javax.swing . GroupLayout (jPanel65);
        jPanel65 . setLayout (jPanel65Layout);
        jPanel65Layout . setHorizontalGroup (
            jPanel65Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel65Layout . createSequentialGroup ()
                .addGroup (jPanel65Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel65Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (btnRestPl, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel142, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (btnSumPl, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel65Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel10)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler12, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel65Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel141, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel65Layout . setVerticalGroup (
            jPanel65Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel65Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel141, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel65Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel65Layout . createSequentialGroup ()
                        .addComponent (filler12, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel65Layout . createSequentialGroup ()
                        .addComponent (jLabel10)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel65Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel142, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnSumPl, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (btnRestPl))))
                .addContainerGap ())
        );

        jLabel143 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel143 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton136 . setText ( " + " );
        jButton136 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton136ActionPerformed (evt);
            }
        });

        jLabel144 . setText ( " 0 " );

        jButton137 . setText ( " + " );

        jLabel11 . setText ( " $ 80 " );

        javax.swing . GroupLayout jPanel66Layout =  new  javax.swing . GroupLayout (jPanel66);
        jPanel66 . setLayout (jPanel66Layout);
        jPanel66Layout . setHorizontalGroup (
            jPanel66Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel66Layout . createSequentialGroup ()
                .addGroup (jPanel66Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel66Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton136, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel144, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton137, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel66Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel11)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler13, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel66Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel143, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel66Layout . setVerticalGroup (
            jPanel66Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel66Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel143, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel66Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel66Layout . createSequentialGroup ()
                        .addComponent (filler13, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel66Layout . createSequentialGroup ()
                        .addComponent (jLabel11)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel66Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel144, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton137, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton136))))
                .addContainerGap ())
        );

        jLabel145 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel145 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton138 . setText ( " + " );
        jButton138 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton138ActionPerformed (evt);
            }
        });

        jLabel146 . setText ( " 0 " );

        jButton139 . setText ( " + " );

        jLabel12 . setText ( " $ 83 " );

        javax.swing . GroupLayout jPanel67Layout =  new  javax.swing . GroupLayout (jPanel67);
        jPanel67 . setLayout (jPanel67Layout);
        jPanel67Layout . setHorizontalGroup (
            jPanel67Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel67Layout . createSequentialGroup ()
                .addGroup (jPanel67Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel67Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton138, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel146, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton139, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel67Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel12)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler14, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel67Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel145, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel67Layout . setVerticalGroup (
            jPanel67Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel67Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel145, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel67Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel67Layout . createSequentialGroup ()
                        .addComponent (filler14, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel67Layout . createSequentialGroup ()
                        .addComponent (jLabel12)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel67Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel146, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton139, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton138))))
                .addContainerGap ())
        );

        jLabel147 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel147 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton140 . setText ( " + " );
        jButton140 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton140ActionPerformed (evt);
            }
        });

        jLabel148 . setText ( " 0 " );

        jButton141 . setText ( " + " );

        jLabel13 . setText ( " $ 350 " );

        javax.swing . GroupLayout jPanel68Layout =  new  javax.swing . GroupLayout (jPanel68);
        jPanel68 . setLayout (jPanel68Layout);
        jPanel68Layout . setHorizontalGroup (
            jPanel68Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel68Layout . createSequentialGroup ()
                .addGroup (jPanel68Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel68Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton140, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel148, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton141, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel68Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel13)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler15, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel68Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel147, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel68Layout . setVerticalGroup (
            jPanel68Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel68Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel147, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel68Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel68Layout . createSequentialGroup ()
                        .addComponent (filler15, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel68Layout . createSequentialGroup ()
                        .addComponent (jLabel13)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel68Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel148, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton141, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton140))))
                .addContainerGap ())
        );

        jLabel149 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel149 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton142 . setText ( " + " );
        jButton142 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton142ActionPerformed (evt);
            }
        });

        jLabel150 . setText ( " 0 " );

        jButton143 . setText ( " + " );

        jLabel14 . setText ( " $ 200 " );

        javax.swing . GroupLayout jPanel69Layout =  new  javax.swing . GroupLayout (jPanel69);
        jPanel69 . setLayout (jPanel69Layout);
        jPanel69Layout . setHorizontalGroup (
            jPanel69Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel69Layout . createSequentialGroup ()
                .addGroup (jPanel69Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel69Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton142, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel150, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton143, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel69Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel14)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler16, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel69Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel149, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel69Layout . setVerticalGroup (
            jPanel69Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel69Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel149, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel69Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel69Layout . createSequentialGroup ()
                        .addComponent (filler16, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel69Layout . createSequentialGroup ()
                        .addComponent (jLabel14)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel69Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel150, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton143, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton142))))
                .addContainerGap ())
        );

        jLabel151 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel151 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton144 . setText ( " + " );
        jButton144 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton144ActionPerformed (evt);
            }
        });

        jLabel152 . setText ( " 0 " );

        jButton145 . setText ( " + " );

        jLabel15 . setText ( " $ 68 " );

        javax.swing . GroupLayout jPanel70Layout =  new  javax.swing . GroupLayout (jPanel70);
        jPanel70 . setLayout (jPanel70Layout);
        jPanel70Layout . setHorizontalGroup (
            jPanel70Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel70Layout . createSequentialGroup ()
                .addGroup (jPanel70Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel70Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton144, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel152, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton145, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel70Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel15)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler17, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel70Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel151, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel70Layout . setVerticalGroup (
            jPanel70Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel70Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel151, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel70Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel70Layout . createSequentialGroup ()
                        .addComponent (filler17, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel70Layout . createSequentialGroup ()
                        .addComponent (jLabel15)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel70Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel152, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton145, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton144))))
                .addContainerGap ())
        );

        javax.swing . GroupLayout jPanel55Layout =  new  javax.swing . GroupLayout (jPanel55);
        jPanel55 . setLayout (jPanel55Layout);
        jPanel55Layout . setHorizontalGroup (
            jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel55Layout . createSequentialGroup ()
                .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel57, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel64, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel65, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel66, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel69, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel70, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel67, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel68, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addGap ( 42 , 42 , 42 )
                .addComponent (filler8, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( 198 , Short . MAX_VALUE ))
        );
        jPanel55Layout . setVerticalGroup (
            jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel55Layout . createSequentialGroup ()
                .addGap ( 139 , 139 , 139 )
                .addComponent (filler8, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
            .addGroup (jPanel55Layout . createSequentialGroup ()
                .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                    .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                        .addGroup (jPanel55Layout . createSequentialGroup ()
                            .addComponent (jPanel69, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel70, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addGroup (jPanel55Layout . createSequentialGroup ()
                            .addComponent (jPanel68, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel67, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )))
                    .addGroup (jPanel55Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                        .addGroup (jPanel55Layout . createSequentialGroup ()
                            .addComponent (jPanel57, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel64, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addGroup (jPanel55Layout . createSequentialGroup ()
                            .addComponent (jPanel65, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel66, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))))
                .addGap ( 0 , 259 , Corto . MAX_VALUE ))
        );

        jScrollPane5 . setViewportView (jPanel55);

        jTabbedPane1 . addTab ( " COMIDA " , jScrollPane5);

        jLabel129 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel129 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton122 . setText ( " + " );
        jButton122 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton122ActionPerformed (evt);
            }
        });

        jLabel130 . setText ( " 0 " );

        jButton123 . setText ( " + " );

        jLabel16 . setText ( " $ 100 " );

        javax.swing . GroupLayout jPanel59Layout =  new  javax.swing . GroupLayout (jPanel59);
        jPanel59 . setLayout (jPanel59Layout);
        jPanel59Layout . setHorizontalGroup (
            jPanel59Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel59Layout . createSequentialGroup ()
                .addGroup (jPanel59Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel59Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton122, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel130, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton123, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel59Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel16)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler19, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel59Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel129, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel59Layout . setVerticalGroup (
            jPanel59Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel59Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel129, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel59Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel59Layout . createSequentialGroup ()
                        .addComponent (filler19, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel59Layout . createSequentialGroup ()
                        .addComponent (jLabel16)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel59Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel130, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton123, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton122))))
                .addContainerGap ())
        );

        jLabel153 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel153 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton146 . setText ( " + " );
        jButton146 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton146ActionPerformed (evt);
            }
        });

        jLabel154 . setText ( " 0 " );

        jButton147 . setText ( " + " );

        jLabel17 . setText ( " $ 130 " );

        javax.swing . GroupLayout jPanel71Layout =  new  javax.swing . GroupLayout (jPanel71);
        jPanel71 . setLayout (jPanel71Layout);
        jPanel71Layout . setHorizontalGroup (
            jPanel71Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel71Layout . createSequentialGroup ()
                .addGroup (jPanel71Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel71Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton146, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel154, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton147, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel71Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel17)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler20, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel71Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel153, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel71Layout . setVerticalGroup (
            jPanel71Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel71Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel153, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel71Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel71Layout . createSequentialGroup ()
                        .addComponent (filler20, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel71Layout . createSequentialGroup ()
                        .addComponent (jLabel17)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel71Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel154, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton147, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton146))))
                .addContainerGap ())
        );

        jLabel155 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel155 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton148 . setText ( " + " );
        jButton148 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton148ActionPerformed (evt);
            }
        });

        jLabel156 . setText ( " 0 " );

        jButton149 . setText ( " + " );

        jLabel18 . setText ( " $ 490 " );

        javax.swing . GroupLayout jPanel72Layout =  new  javax.swing . GroupLayout (jPanel72);
        jPanel72 . setLayout (jPanel72Layout);
        jPanel72Layout . setHorizontalGroup (
            jPanel72Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel72Layout . createSequentialGroup ()
                .addGroup (jPanel72Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel72Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton148, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel156, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton149, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel72Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel18)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler21, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel72Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel155, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel72Layout . setVerticalGroup (
            jPanel72Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel72Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel155, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel72Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel72Layout . createSequentialGroup ()
                        .addComponent (filler21, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel72Layout . createSequentialGroup ()
                        .addComponent (jLabel18)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel72Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel156, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton149, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton148))))
                .addContainerGap ())
        );

        jLabel157 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel157 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton150 . setText ( " + " );
        jButton150 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton150ActionPerformed (evt);
            }
        });

        jLabel158 . setText ( " 0 " );

        jButton151 . setText ( " + " );

        jLabel19 . setText ( " $ 125 " );

        javax.swing . GroupLayout jPanel73Layout =  new  javax.swing . GroupLayout (jPanel73);
        jPanel73 . setLayout (jPanel73Layout);
        jPanel73Layout . setHorizontalGroup (
            jPanel73Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel73Layout . createSequentialGroup ()
                .addGroup (jPanel73Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel73Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton150, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel158, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton151, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel73Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel19)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler22, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel73Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel157, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel73Layout . setVerticalGroup (
            jPanel73Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel73Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel157, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel73Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel73Layout . createSequentialGroup ()
                        .addComponent (filler22, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel73Layout . createSequentialGroup ()
                        .addComponent (jLabel19)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel73Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel158, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton151, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton150))))
                .addContainerGap ())
        );

        jLabel161 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel161 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton154 . setText ( " + " );
        jButton154 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton154ActionPerformed (evt);
            }
        });

        jLabel162 . setText ( " 0 " );

        jButton155 . setText ( " + " );

        jLabel21 . setText ( " $ 169 " );

        javax.swing . GroupLayout jPanel75Layout =  new  javax.swing . GroupLayout (jPanel75);
        jPanel75 . setLayout (jPanel75Layout);
        jPanel75Layout . setHorizontalGroup (
            jPanel75Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel75Layout . createSequentialGroup ()
                .addGroup (jPanel75Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel75Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton154, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel162, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton155, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel75Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel21)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler24, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel75Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel161, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel75Layout . setVerticalGroup (
            jPanel75Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel75Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel161, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel75Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel75Layout . createSequentialGroup ()
                        .addComponent (filler24, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel75Layout . createSequentialGroup ()
                        .addComponent (jLabel21)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel75Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel162, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton155, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton154))))
                .addContainerGap ())
        );

        jLabel163 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel163 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton156 . setText ( " + " );
        jButton156 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton156ActionPerformed (evt);
            }
        });

        jLabel164 . setText ( " 0 " );

        jButton157 . setText ( " + " );

        jLabel22 . setText ( " $ 69 " );

        javax.swing . GroupLayout jPanel76Layout =  new  javax.swing . GroupLayout (jPanel76);
        jPanel76 . setLayout (jPanel76Layout);
        jPanel76Layout . setHorizontalGroup (
            jPanel76Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel76Layout . createSequentialGroup ()
                .addGroup (jPanel76Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel76Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton156, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel164, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton157, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel76Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel22)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler25, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel76Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel163, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel76Layout . setVerticalGroup (
            jPanel76Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel76Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel163, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel76Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel76Layout . createSequentialGroup ()
                        .addComponent (filler25, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel76Layout . createSequentialGroup ()
                        .addComponent (jLabel22)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel76Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel164, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton157, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton156))))
                .addContainerGap ())
        );

        jLabel165 . setMaximumSize ( nueva  dimensión java.awt . ( 120 , 120 ));
        jLabel165 . setMinimumSize ( nueva  dimensión java.awt . ( 120 , 120 ));

        jButton158 . setText ( " + " );
        jButton158 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton158ActionPerformed (evt);
            }
        });

        jLabel166 . setText ( " 0 " );

        jButton159 . setText ( " + " );

        jLabel23 . setText ( " $ 100 " );

        javax.swing . GroupLayout jPanel77Layout =  new  javax.swing . GroupLayout (jPanel77);
        jPanel77 . setLayout (jPanel77Layout);
        jPanel77Layout . setHorizontalGroup (
            jPanel77Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel77Layout . createSequentialGroup ()
                .addGroup (jPanel77Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel77Layout . createSequentialGroup ()
                        .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addComponent (jButton158, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jLabel166, javax.swing . GroupLayout . PREFERRED_SIZE , 20 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addComponent (jButton159, javax.swing . GroupLayout . PREFERRED_SIZE , 45 , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 29 , 29 , 29 ))
                    .addGroup (jPanel77Layout . createSequentialGroup ()
                        .addGap ( 56 , 56 , 56 )
                        .addComponent (jLabel23)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )))
                .addComponent (filler26, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 27 , 27 , 27 ))
            .addGroup (jPanel77Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel165, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel77Layout . setVerticalGroup (
            jPanel77Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel77Layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jLabel165, javax.swing . GroupLayout . PREFERRED_SIZE , 115 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel77Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel77Layout . createSequentialGroup ()
                        .addComponent (filler26, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 0 , 0 , Corto . MAX_VALUE ))
                    .addGroup (jPanel77Layout . createSequentialGroup ()
                        .addComponent (jLabel23)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        .addGroup (jPanel77Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel166, javax.swing . GroupLayout . PREFERRED_SIZE , 31 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton159, javax.swing . GroupLayout . PREFERRED_SIZE , 30 , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jButton158))))
                .addContainerGap ())
        );

        javax.swing . GroupLayout jPanel56Layout =  new  javax.swing . GroupLayout (jPanel56);
        jPanel56 . setLayout (jPanel56Layout);
        jPanel56Layout . setHorizontalGroup (
            jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel56Layout . createSequentialGroup ()
                .addContainerGap ()
                .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel59, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel71, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel72, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel73, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel76, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jPanel77, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addComponent (jPanel75, javax.swing . GroupLayout . PREFERRED_SIZE , 170 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 36 , 36 , 36 )
                .addComponent (filler18, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        jPanel56Layout . setVerticalGroup (
            jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel56Layout . createSequentialGroup ()
                .addGap ( 139 , 139 , 139 )
                .addComponent (filler18, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
            .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , jPanel56Layout . createSequentialGroup ()
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                    .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                        .addGroup (jPanel56Layout . createSequentialGroup ()
                            .addComponent (jPanel76, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel77, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addComponent (jPanel75, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                    .addGroup (jPanel56Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                        .addGroup (jPanel56Layout . createSequentialGroup ()
                            .addComponent (jPanel59, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel71, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addGroup (jPanel56Layout . createSequentialGroup ()
                            .addComponent (jPanel72, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                            .addComponent (jPanel73, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))))
                .addContainerGap ())
        );

        jTabbedPane1 . addTab ( " LIMPIEZA " , jPanel56);

        javax.swing . Diseño GroupLayout =  new  javax.swing . GroupLayout (getContentPane ());
        getContentPane () . setLayout (diseño);
        diseño . setHorizontalGroup (
            diseño . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addContainerGap ()
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                    .addComponent (jPanel1, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                    .addGroup (layout . createSequentialGroup ()
                        .addComponent (jPanel2, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                        .addGap ( 18 , 18 , 18 )
                        .addComponent (jTabbedPane1, javax.swing . GroupLayout . PREFERRED_SIZE , 0 , Short . MAX_VALUE )))
                .addContainerGap ())
        );
        diseño . setVerticalGroup (
            diseño . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 18 , 18 , 18 )
                .addComponent (jPanel1, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (jPanel2, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                    .addComponent (jTabbedPane1, javax.swing . GroupLayout . PREFERRED_SIZE , 0 , Short . MAX_VALUE ))
                .addContainerGap ())
        );

        jTabbedPane1 . getAccessibleContext () . setAccessibleName ( " ropa " );

        paquete();
    } // </editor-fold> // GEN-END: initComponents

     vacío  privado jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton1ActionPerformed
        // TODO agregue su código de manejo aquí: //
        // jButton1.addActionListener (new ActionListener () {
        //     @Override
        //     public void actionPerformed (ActionEvent e) {
        //         setVisible (falso);
        //     }
        // });
    } // GEN-LAST: event_jButton1ActionPerformed

     nulo  privado jTextField1ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jTextField1ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jTextField1ActionPerformed

    privado  vacío  jButton120ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton120ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton120ActionPerformed

     vacío  privado jButton158ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton158ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton158ActionPerformed

     vacío  privado jButton156ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton156ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton156ActionPerformed

     vacío  privado jButton154ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton154ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton154ActionPerformed

     vacío  privado jButton150ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton150ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton150ActionPerformed

     nulo  privado jButton148ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton148ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton148ActionPerformed

     nulo  privado jButton146ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton146ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton146ActionPerformed

     nulo  privado jButton122ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton122ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton122ActionPerformed

    privado  nulo  jButton144ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton144ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton144ActionPerformed

     nulo  privado jButton142ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton142ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton142ActionPerformed

     nulo  privado jButton140ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton140ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton140ActionPerformed

     nulo  privado jButton138ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton138ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton138ActionPerformed

     nulo  privado jButton136ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton136ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton136ActionPerformed

     nulo  privado btnRestPlActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btnRestPlActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_btnRestPlActionPerformed

     vacío  privado jButton132ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton132ActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_jButton132ActionPerformed

     nulo  privado btnRestCActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btnRestCActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_btnRestCActionPerformed

     nulo  privado btnRestMActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btnRestMActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_btnRestMActionPerformed

     nulo  privado btnRestRActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btnRestRActionPerformed
        // TODO agregue su código de manejo aquí:
    } // GEN-LAST: event_btnRestRActionPerformed

    / **
     * @param argumenta los argumentos de la línea de comando
     * /
    public  static  void  main ( String  args []) {
        / * Establecer el aspecto y la sensación de Nimbus * /
        // <editor-fold defaultstate = "collapsed" desc = "Código de configuración de aspecto (opcional)">
        / * Si Nimbus (introducido en Java SE 6) no está disponible, manténgase con el aspecto predeterminado.
         * Para más detalles, consulte http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         * /
        prueba {
            for ( javax.swing . UIManager . LookAndFeelInfo info :  javax.swing . UIManager . getInstalledLookAndFeels ()) {
                if ( " Nimbus " . es igual a (info . getName ())) {
                    javax.swing . UIManager . setLookAndFeel (info . getClassName ());
                    romper ;
                }
            }
        } catch ( ClassNotFoundException ex) {
            java.util.logging . Registrador . getLogger ( Intentando . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( InstantiationException ex) {
            java.util.logging . Registrador . getLogger ( Intentando . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( IllegalAccessException ex) {
            java.util.logging . Registrador . getLogger ( Intentando . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( javax.swing . UnsupportedLookAndFeelException ex) {
            java.util.logging . Registrador . getLogger ( Intentando . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        }
        // </editor-fold>

        / * Crear y mostrar el formulario * /
        java.awt . EventQueue . invokeLater ( nuevo  Runnable () {
            público  vacío  Correr () {

            }

            @Anular
            public  void  run () {
                lanzar una  nueva  UnsupportedOperationException ( " Todavía no es compatible " ); // Para cambiar el cuerpo de los métodos generados, elija Herramientas | Plantillas.
            }
        });
    }

    // Declaración de variables - no modificar // GEN-BEGIN: variables
     javax.swing privado . JButton btnRestC;
     javax.swing privado . JButton btnRestCm;
     javax.swing privado . JButton btnRestM;
     javax.swing privado . JButton btnRestP;
     javax.swing privado . JButton btnRestPl;
     javax.swing privado . JButton btnRestR;
     javax.swing privado . JButton btnRestZ;
     javax.swing privado . JButton btnSumC;
     javax.swing privado . JButton btnSumCm;
     javax.swing privado . JButton btnSumM;
     javax.swing privado . JButton btnSumP;
     javax.swing privado . JButton btnSumPl;
     javax.swing privado . JButton btnSumR;
     javax.swing privado . JButton btnSumZ;
     javax.swing privado . Caja . Relleno relleno 10;
     javax.swing privado . Caja . Relleno relleno11;
     javax.swing privado . Caja . Relleno relleno 12;
     javax.swing privado . Caja . Relleno relleno 13;
     javax.swing privado . Caja . Relleno relleno 14;
     javax.swing privado . Caja . Relleno relleno 15;
     javax.swing privado . Caja . Relleno relleno 16;
     javax.swing privado . Caja . Relleno relleno 17;
     javax.swing privado . Caja . Relleno relleno18;
     javax.swing privado . Caja . Relleno relleno 19;
     javax.swing privado . Caja . Relleno relleno 20;
     javax.swing privado . Caja . Relleno relleno 21;
     javax.swing privado . Caja . Relleno de relleno22;
     javax.swing privado . Caja . Relleno relleno 24;
     javax.swing privado . Caja . Relleno relleno 25;
     javax.swing privado . Caja . Relleno de relleno26;
     javax.swing privado . Caja . Relleno relleno 3;
     javax.swing privado . Caja . Relleno relleno 4;
     javax.swing privado . Caja . Relleno relleno 8;
     javax.swing privado . Caja . Relleno relleno9;
     javax.swing privado . JButton jButton1;
     javax.swing privado . JButton jButton120;
     javax.swing privado . JButton jButton121;
     javax.swing privado . JButton jButton122;
     javax.swing privado . JButton jButton123;
     javax.swing privado . JButton jButton132;
     javax.swing privado . JButton jButton133;
     javax.swing privado . JButton jButton136;
     javax.swing privado . JButton jButton137;
     javax.swing privado . JButton jButton138;
     javax.swing privado . JButton jButton139;
     javax.swing privado . JButton jButton140;
     javax.swing privado . JButton jButton141;
     javax.swing privado . JButton jButton142;
     javax.swing privado . JButton jButton143;
     javax.swing privado . JButton jButton144;
     javax.swing privado . JButton jButton145;
     javax.swing privado . JButton jButton146;
     javax.swing privado . JButton jButton147;
     javax.swing privado . JButton jButton148;
     javax.swing privado . JButton jButton149;
     javax.swing privado . JButton jButton150;
     javax.swing privado . JButton jButton151;
     javax.swing privado . JButton jButton154;
     javax.swing privado . JButton jButton155;
     javax.swing privado . JButton jButton156;
     javax.swing privado . JButton jButton157;
     javax.swing privado . JButton jButton158;
     javax.swing privado . JButton jButton159;
     javax.swing privado . JLabel jLabel1;
     javax.swing privado . JLabel jLabel10;
     javax.swing privado . JLabel jLabel100;
     javax.swing privado . JLabel jLabel101;
     javax.swing privado . JLabel jLabel102;
     javax.swing privado . JLabel jLabel103;
     javax.swing privado . JLabel jLabel104;
     javax.swing privado . JLabel jLabel105;
     javax.swing privado . JLabel jLabel106;
     javax.swing privado . JLabel jLabel107;
     javax.swing privado . JLabel jLabel11;
     javax.swing privado . JLabel jLabel12;
     javax.swing privado . JLabel jLabel125;
     javax.swing privado . JLabel jLabel126;
     javax.swing privado . JLabel jLabel127;
     javax.swing privado . JLabel jLabel128;
     javax.swing privado . JLabel jLabel129;
     javax.swing privado . JLabel jLabel13;
     javax.swing privado . JLabel jLabel130;
     javax.swing privado . JLabel jLabel139;
     javax.swing privado . JLabel jLabel14;
     javax.swing privado . JLabel jLabel140;
     javax.swing privado . JLabel jLabel141;
     javax.swing privado . JLabel jLabel142;
     javax.swing privado . JLabel jLabel143;
     javax.swing privado . JLabel jLabel144;
     javax.swing privado . JLabel jLabel145;
     javax.swing privado . JLabel jLabel146;
     javax.swing privado . JLabel jLabel147;
     javax.swing privado . JLabel jLabel148;
     javax.swing privado . JLabel jLabel149;
     javax.swing privado . JLabel jLabel15;
     javax.swing privado . JLabel jLabel150;
     javax.swing privado . JLabel jLabel151;
     javax.swing privado . JLabel jLabel152;
     javax.swing privado . JLabel jLabel153;
     javax.swing privado . JLabel jLabel154;
     javax.swing privado . JLabel jLabel155;
     javax.swing privado . JLabel jLabel156;
     javax.swing privado . JLabel jLabel157;
     javax.swing privado . JLabel jLabel158;
     javax.swing privado . JLabel jLabel16;
     javax.swing privado . JLabel jLabel161;
     javax.swing privado . JLabel jLabel162;
     javax.swing privado . JLabel jLabel163;
     javax.swing privado . JLabel jLabel164;
     javax.swing privado . JLabel jLabel165;
     javax.swing privado . JLabel jLabel166;
     javax.swing privado . JLabel jLabel17;
     javax.swing privado . JLabel jLabel18;
     javax.swing privado . JLabel jLabel19;
     javax.swing privado . JLabel jLabel2;
     javax.swing privado . JLabel jLabel20;
     javax.swing privado . JLabel jLabel21;
     javax.swing privado . JLabel jLabel22;
     javax.swing privado . JLabel jLabel23;
     javax.swing privado . JLabel jLabel3;
     javax.swing privado . JLabel jLabel4;
     javax.swing privado . JLabel jLabel5;
     javax.swing privado . JLabel jLabel6;
     javax.swing privado . JLabel jLabel7;
     javax.swing privado . JLabel jLabel8;
     javax.swing privado . JLabel jLabel9;
    public  javax.swing . JLabel jLabel97;
     javax.swing privado . JLabel jLabel99;
     javax.swing privado . JPanel jPanel1;
     javax.swing privado . JPanel jPanel2;
     javax.swing privado . JPanel jPanel39;
     javax.swing privado . JPanel jPanel40;
     javax.swing privado . JPanel jPanel41;
     javax.swing privado . JPanel jPanel42;
     javax.swing privado . JPanel jPanel43;
     javax.swing privado . JPanel jPanel44;
     javax.swing privado . JPanel jPanel55;
     javax.swing privado . JPanel jPanel56;
     javax.swing privado . JPanel jPanel57;
     javax.swing privado . JPanel jPanel58;
     javax.swing privado . JPanel jPanel59;
     javax.swing privado . JPanel jPanel64;
     javax.swing privado . JPanel jPanel65;
     javax.swing privado . JPanel jPanel66;
     javax.swing privado . JPanel jPanel67;
     javax.swing privado . JPanel jPanel68;
     javax.swing privado . JPanel jPanel69;
     javax.swing privado . JPanel jPanel70;
     javax.swing privado . JPanel jPanel71;
     javax.swing privado . JPanel jPanel72;
     javax.swing privado . JPanel jPanel73;
     javax.swing privado . JPanel jPanel75;
     javax.swing privado . JPanel jPanel76;
     javax.swing privado . JPanel jPanel77;
     javax.swing privado . JScrollPane jScrollPane1;
     javax.swing privado . JScrollPane jScrollPane2;
     javax.swing privado . JScrollPane jScrollPane3;
     javax.swing privado . JScrollPane jScrollPane5;
     javax.swing privado . JTabbedPane jTabbedPane1;
     javax.swing privado . JTextField jTextField1;
    public  javax.swing . JLabel lbl_estUs;
    // Fin de la declaración de variables // GEN-END: variables

     nulo  privado a () {
        Sistema . a cabo . println ( " holo " );
        initComponents ();
        
        // Imagenes Ropa
        
        Icono de ImageIcon ;
        icon =  new  ImageIcon ( " Imagenes / remera.jpg " );
        jLabel100 . setIcon (icono);
        ImageIcon icon2;
        icon2 =  nuevo  ImageIcon ( " Imagenes / Pantal.jpg " );
        jLabel97 . setIcon (icon2);
        ImageIcon icon3;
        icon3 =  new  ImageIcon ( " Imagenes / medias.jpg " );
        jLabel102 . setIcon (icon3);
        ImageIcon icon4;
        icon4 =  new  ImageIcon ( " Imagenes / campera.jpg " );
        jLabel106 . setIcon (icon4);
        ImageIcon icon5;
        icon5 =  nuevo  ImageIcon ( " Imagenes / zapatillas.jpg " );
        jLabel104 . setIcon (icon5);
        
        // Imagenes Comida

        ImageIcon iconb1;
        iconb1 =  nuevo  ImageIcon ( " Imagenes / carne.jpg " );
        jLabel125 . setIcon (iconb1);
        ImageIcon iconb2;
        iconb2 =  nuevo  ImageIcon ( " Imagenes / pollo.jpg " );
        jLabel141 . setIcon (iconb2);
        ImageIcon iconb3;
        iconb3 =  nuevo  ImageIcon ( " Imagenes / pescado.jpg " );
        jLabel149 . setIcon (iconb3);
        ImageIcon iconb4;
        iconb4 =  nuevo  ImageIcon ( " Imagenes / cerdo.jpg " );
        jLabel147 . setIcon (iconb4);
        ImageIcon iconb5;
        iconb5 =  nuevo  ImageIcon ( " Imagenes / tomate.jpg " );
        jLabel139 . setIcon (iconb5);
        ImageIcon iconb6;
        iconb6 =  nuevo  ImageIcon ( " Imagenes / papa.jpg " );
        jLabel143 . setIcon (iconb6);
        ImageIcon iconb7;
        iconb7 =  nuevo  ImageIcon ( " Imagenes / lechuga.jpg " );
        jLabel151 . setIcon (iconb7);
        ImageIcon iconb8;
        iconb8 =  nuevo  ImageIcon ( " Imagenes / zanahorias.jpg " );
        jLabel145 . setIcon (iconb8);
        
        // Imagenes Limpieza
        
        ImageIcon iconc;
        iconc =  new  ImageIcon ( " Imagenes / papel-higienico.jpg " );
        jLabel129 . setIcon (iconc);
        ImageIcon iconc2;
        iconc2 =  new  ImageIcon ( " Imagenes / trapo-de-piso.jpg " );
        jLabel155 . setIcon (iconc2);
        ImageIcon iconc3;
        iconc3 =  new  ImageIcon ( " Imagenes / detergente.jpg " );
        jLabel163 . setIcon (iconc3);
        ImageIcon iconc4;
        iconc4 =  new  ImageIcon ( " Imagenes / lavandina.jpg " );
        jLabel161 . setIcon (iconc4);
        ImageIcon iconc5;
        iconc5 =  nuevo  ImageIcon ( " Imagenes / jabon.jpg " );
        jLabel153 . setIcon (iconc5);
        ImageIcon iconc6;
        iconc6 =  nuevo  ImageIcon ( " Imagenes / escoba.jpg " );
        jLabel157 . setIcon (iconc6);
        ImageIcon iconc7;
        iconc7 =  nuevo  ImageIcon ( " Imagenes / limpia-vidrios.jpg " );
        jLabel165 . setIcon (iconc7);
        

        / * Usuario n1 = nuevo Usuario ("n", "n");
        Nombre de usuario JTextField = nuevo JTextField ();
        Contraseña JTextField = new JPasswordField ();
        Mensaje del objeto [] = {
            "Nombre de usuario:", nombre de usuario,
            "Contraseña:", contraseña,};
        int option = JOptionPane.showConfirmDialog (nulo, mensaje, "Iniciar sesión", JOptionPane.OK_CANCEL_OPTION);
        if (opción == JOptionPane.OK_OPTION) {
            if (username.getText (). equals (n1.getUser ()) && password.getText (). equals (n1.getPass ())) {
                initComponents ();
            } más {
                System.out.println ("error de inicio de sesión");
            }
        } más {
            System.out.println ("Inicio de sesión cancelado");
        } * /
    }
}
