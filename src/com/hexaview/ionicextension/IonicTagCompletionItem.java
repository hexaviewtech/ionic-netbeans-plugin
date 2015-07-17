/*
 * This class is responsible for matching and rendering the completion item.
 * 
 */
package com.hexaview.ionicextension;

/**
 *
 * @author Sampat-Hexaview
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JToolTip;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.editor.completion.Completion;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;

public class IonicTagCompletionItem implements CompletionItem {

    private final  String text;
    private static final ImageIcon fieldIcon =
            new ImageIcon(ImageUtilities.loadImage("com/hexaview/ionicextension/iconic.png"));
            
    private static final Color fieldColor = Color.decode("0x0000B2");
    private final int caretOffset;
    private final int dotOffset;

    public IonicTagCompletionItem(String text, int dotOffset, int caretOffset) {
        this.text = text;
        this.dotOffset = dotOffset;
        this.caretOffset = caretOffset;
    }

    @Override
    public void defaultAction(JTextComponent jTextComponent) {
        try {
            StyledDocument doc = (StyledDocument) jTextComponent.getDocument();
            doc.remove(dotOffset, caretOffset - dotOffset);
            doc.insertString(dotOffset, text, null);
            Completion.get().hideAll();
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public void processKeyEvent(KeyEvent arg0) {
    }

    @Override
    public int getPreferredWidth(Graphics graphics, Font font) {
        String text1="S"+text.substring(1, text.length()-1)+"ss";
        return CompletionUtilities.getPreferredWidth(text1, null, graphics, font);
    }

    @Override
    public void render(Graphics g, Font defaultFont, Color defaultColor,
            Color backgroundColor, int width, int height, boolean selected) {
        String text1;
        if(text.charAt(0)=='<')
                text1="&lt;"+text.substring(1, text.length()-1)+"&gt;";
        else 
            text1 =text;
        CompletionUtilities.renderHtml(fieldIcon, text1, null, g, defaultFont,
                (selected ? Color.white : fieldColor), width, height, selected);
    }

    @Override
    public CompletionTask createDocumentationTask() {
    return new AsyncCompletionTask(new AsyncCompletionQuery() {
        @Override
        protected void query(CompletionResultSet completionResultSet, Document document, int i) {
            completionResultSet.setDocumentation(new IonicTagCompletionDocumentation(IonicTagCompletionItem.this));
            completionResultSet.finish();
        }
    });
}

    @Override
    public CompletionTask createToolTipTask() {
        return new AsyncCompletionTask(new AsyncCompletionQuery() {

            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int i) {
                JToolTip toolTip = new JToolTip();
                toolTip.setTipText("Press Enter to insert \"" + text.substring(1, text.length()-1) + "\"");
                completionResultSet.setToolTip(toolTip);
                completionResultSet.finish();
            }
        });
    }

    @Override
    public boolean instantSubstitution(JTextComponent arg0) {
        return false;
    }

    @Override
    public int getSortPriority() {
        return 0;
    }

    @Override
    public CharSequence getSortText() {
        return text;
    }

    public String getText() {
        return text;
    }

    @Override
    public CharSequence getInsertPrefix() {
        return text;
    }
}

