package com.codename1.uikit.materialscreens;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.codename1.ui.BrowserComponent;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.SideMenuBar;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Chuqs
 */
 class website extends SideMenuBaseForm {
    public void showWebGui(){
       final Form fm = new Form("Nasonic Music Investment");
       Toolbar tb = getToolbar();
       Button menuButton = new Button("");
        menuButton.setUIID("Nasonic");
       FontImage.setMaterialIcon(menuButton, FontImage.MATERIAL_MENU);
        menuButton.addActionListener(e -> ((SideMenuBar)getToolbar().getMenuBar()).openMenu(null));
       String backTitle = "Quit";
                        if(UIManager.getInstance().isThemeConstant("backUsesTitleBool", false)) {
                            backTitle = "Main";
                        }
        Command backCommand = new Command(backTitle) {
                            public void actionPerformed(ActionEvent ev) {
                                //fm.showBack();
                                //website myform = new website ();
                                closeApp();
                            } 
                        }; 
                        fm.addCommand(backCommand);
                        fm.setBackCommand(backCommand);
                       
      fm.setLayout(new BorderLayout());

  BrowserComponent browser = new BrowserComponent();
 
    browser.setURL("http://www.nasonicmusic.com");
 
    fm.addComponent(BorderLayout.CENTER, browser);
        
         fm.show();
         
    }
    
    public void showWebGui2(){
       final Form fm = new Form("Divine Encounter Website");
       
       String backTitle = "Back";
                        if(UIManager.getInstance().isThemeConstant("backUsesTitleBool", false)) {
                            backTitle = "Main";
                        }
        Command backCommand = new Command(backTitle) {
                            public void actionPerformed(ActionEvent ev) {
                                //f.showBack();
                                website myform = new website ();
                                //myform.buildSideMenu(fm);
                            } 
                        }; 
                        fm.addCommand(backCommand);
                        fm.setBackCommand(backCommand);
                       
      fm.setLayout(new BorderLayout());

  BrowserComponent browser = new BrowserComponent();
 
    browser.setURL("http://www.standrewcathedral.org/divine-encounter");
 
    fm.addComponent(BorderLayout.CENTER, browser);
        
         fm.show(); 
    }
    @Override
    protected void showOtherForm(Resources res) {
        new StatsForm(res).show();
    }
    /* public void showWebGui3(){
       final Form fm = new Form("Cathedral Website");
       
       String backTitle = "Back";
                        if(UIManager.getInstance().isThemeConstant("backUsesTitleBool", false)) {
                            backTitle = "Main";
                        }
        Command backCommand = new Command(backTitle) {
                            public void actionPerformed(ActionEvent ev) {
                                //f.showBack();
                                StAndrews myform = new StAndrews ();
                                myform.buildSideMenu(fm);
                            } 
                        }; 
                        fm.addCommand(backCommand);
                        fm.setBackCommand(backCommand);
                       
      fm.setLayout(new BorderLayout());

  BrowserComponent browser3 = new BrowserComponent();
    browser3.setURL("jar:///cathedraltube.html");
 
    fm.addComponent(BorderLayout.CENTER, browser3);
        
         fm.show(); 
    }
      public void showWebGui4(){
       final Form fm = new Form("Divine Encounter");
       
       String backTitle = "Back";
                        if(UIManager.getInstance().isThemeConstant("backUsesTitleBool", false)) {
                            backTitle = "Main";
                        }
        Command backCommand = new Command(backTitle) {
                            public void actionPerformed(ActionEvent ev) {
                                //f.showBack();
                                StAndrews myform = new StAndrews ();
                                myform.buildSideMenu(fm);
                            } 
                        }; 
                        fm.addCommand(backCommand);
                        fm.setBackCommand(backCommand);
                       
      fm.setLayout(new BorderLayout());

  BrowserComponent browser4 = new BrowserComponent();
    browser4.setURL("jar:///cathedraltube.html");
 
    fm.addComponent(BorderLayout.CENTER, browser4);
        
         fm.show(); 
    }
*/
    public  void closeApp(){
       System.exit(0);
    }
}
