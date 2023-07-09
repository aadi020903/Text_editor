import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class notepad implements ActionListener {
    Frame f;
    String s;
    int sty = 0, siz = 10;
    MenuBar mb;
    Menu fi, ed, fo, fon, co, st, si;
    MenuItem ne, op, sa, ex, cu, cp, pa, bo, it, pl, te, tw, th, bac, fac;
    TextArea ta;

    notepad() {
        f = new Frame();
        mb = new MenuBar();
        ta = new TextArea();
        fi = new Menu("File"); 
        ed = new Menu("Edit");
        fo = new Menu("Format");
        fon = new Menu("Font");
        co = new Menu("Color");
        st = new Menu("Style");
        si = new Menu("Size");
        ne = new MenuItem("New");
        op = new MenuItem("Open");
        sa = new MenuItem("Save");
        ex = new MenuItem("Exit");
        cu = new MenuItem("Cut");
        cp = new MenuItem("Copy");
        pa = new MenuItem("Paste");
        bo = new MenuItem("Bold");
        it = new MenuItem("Italic");
        pl = new MenuItem("Plain");
        te = new MenuItem("10");
        tw = new MenuItem("20");
        th = new MenuItem("30");
        bac = new MenuItem("Back Color");
        fac = new MenuItem("Fore Color");

        fi.add(ne);
        fi.add(op);
        fi.add(sa);
        fi.add(ex);

        ed.add(cu);
        ed.add(cp);
        ed.add(pa);

        fo.add(fon);
        fo.add(co);

        fon.add(st);
        fon.add(si);

        st.add(bo);
        st.add(it);
        st.add(pl);

        co.add(bac);
        co.add(fac);
        
        si.add(te);
        si.add(tw);
        si.add(th);

        mb.add(fi);
        mb.add(fon);
        mb.add(ed);
        mb.add(fo);

        f.setMenuBar(mb);
        f.add(ta);

        ne.addActionListener(this);
        op.addActionListener(this);
        sa.addActionListener(this);
        ex.addActionListener(this);
        cu.addActionListener(this);
        cp.addActionListener(this);
        pa.addActionListener(this);
        bo.addActionListener(this);
        it.addActionListener(this);
        pl.addActionListener(this);
        te.addActionListener(this);
        tw.addActionListener(this);
        th.addActionListener(this);
        bac.addActionListener(this);
        fac.addActionListener(this);
        
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ne)
        {
            ta.setText("");
        }
        else if(e.getSource()==op)
        {
            JFileChooser jc = new JFileChooser();
            jc.showOpenDialog(f);
        }
        else if(e.getSource()==sa)
        {
            JFileChooser jc = new JFileChooser();
            jc.showSaveDialog(f);
        }
        else if(e.getSource()==ex)
        {
            System.exit(0);
        }
        else if(e.getSource()==cu)
        {
            s= ta.getSelectedText();
            int i= ta.getSelectionStart();
            int j= ta.getSelectionEnd();

            ta.replaceRange("", i, j);
        }
        else if(e.getSource()==cp)
        {
            s= ta.getSelectedText();
        }
        else if(e.getSource()==pa)
        {
            ta.insert(s, ta.getSelectionStart());
        }
        else if(e.getSource() == bo)
        {
            sty = 1;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource() == it)
        {
            sty = 2;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource() == pl)
        {
            sty = 3;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource()==te)
        {
            siz= 10;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource()==tw)
        {
            siz= 20;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource()==th)
        {
            siz= 30;
            Font fo = new Font("Arial", sty, siz);
            ta.setFont(fo);
        }
        else if(e.getSource()==bac)
        {
            JColorChooser jc= new JColorChooser();
            Color c = jc.showDialog(f,"Back Color",Color.RED);
            ta.setBackground(c);
        }
        else if(e.getSource()==fac)
        {
            JColorChooser jc= new JColorChooser();
            Color c = jc.showDialog(f,"Fore Color",Color.BLUE);
            ta.setBackground(c);
        }


    }
    public static void main(String[] args) {
        notepad n= new notepad();


    }

}