/*
 * This class provide the item and the documentation data
 *  
 */
package com.hexaview.ionicextension;

import java.util.HashMap;

/**
 *
 * @author Sampat-Hexaview
 */
public class IonicTagData {
    static String[] ionTags={
            "<ion-content>",
            "<ion-refresher>",
            "<ion-pane>",
            "<ion-checkbox>",
            "<ion-radio>",
            "on-touch",
            "on-hold",
            "on-tap",
            "on-double-tap",
            "on-release",
            "on-drag",
            "on-drag-up",
            "on-drag-right",
            "on-drag-down",
            "on-drag-left",
            "on-swipe",
            "on-swipe-up",
            "on-swipe-right",
            "on-swipe-down",
            "on-swipe-left",
            "<ion-header-bar>",
            "<ion-footer-bar>",
            "<ion-list>",
            "<ion-item>",
            "<ion-delete-button>",
            "<ion-reorder-button>",
            "<ion-option-button>",
            "collection-repeat",
            "<ion-modal-view>",
            "<ion-nav-view>",
            "<ion-view>",
            "<ion-nav-bar>",
            "<ion-nav-back-button>",
            "<ion-nav-buttons>",
            "<ion-nav-title>",
            "nav-transition",
            "nav-direction",
            "<ion-popover-view>",
            "<ion-scroll>",
            "<ion-infinite-scroll>",
            "<ion-side-menus>",
            "<ion-side-menu-content>",
            "<ion-side-menu>",
            "expose-aside-when",
            "menu-toggle",
            "enable-menu-with-back-views",
            "menu-close",
            "<ion-slide-box>",
            "<ion-slide-pager>",
            "<ion-slide>",
            "<ionSpinner>",
            "<ion-tabs>",
            "<ion-tab>"
        };
    static  HashMap<String, String> docs= new HashMap<String,String>();
    static {
        docs.put("ion-content","The ionContent directive provides an easy to use content area that can be configured to use Ionic's custom Scroll View, or the built in overflow scrolling of the browser.");
        docs.put("ion-refresher","Allows you to add pull-to-refresh to a scrollView.\n" +"\n" +           "Place it as the first child of your ionContent or ionScroll element.\n" +"\n" +           "When refreshing is complete, $broadcast the 'scroll.refreshComplete' event from your controller.");
        docs.put("ion-pane","A simple container that fits content, with no side effects. Adds the 'pane' class to the element.");
        docs.put("ion-checkbox","The checkbox is no different than the HTML checkbox input, except it's styled differently.");
        docs.put("ion-radio","The radio directive is no different than the HTML radio input, except it's styled differently.");
        docs.put("ion-toggle","A toggle is an animated switch which binds a given model to a boolean.");
        docs.put("on-touch","Called immediately when the user first begins a touch. This gesture does not wait for a touchend/mouseup.");
        docs.put("on-hold","Touch stays at the same location for 500ms. Similar to long touch events available for AngularJS and jQuery.");
        docs.put("on-tap","Quick touch at a location. If the duration of the touch goes longer than 250ms it is no longer a tap gesture.");
        docs.put("on-double-tap","Double tap touch at a location.");
        docs.put("on-release","Called when the user ends a touch.");
        docs.put("on-drag","Move with one touch around on the page. Blocking the scrolling when moving left and right is a good practice. When all the drag events are blocking you disable scrolling on that area.");
        docs.put("on-drag-up","Called when the element is dragged up");
        docs.put("on-drag-right","Called when the element is dragged to the right.");
        docs.put("on-drag-down","Called when the element is dragged down.");
        docs.put("on-drag-left","Called when the element is dragged to the left.");
        docs.put("on-swipe","Called when a moving touch has a high velocity in any direction.");
        docs.put("on-swipe-up","Called when a moving touch has a high velocity moving up.");
        docs.put("on-swipe-right","Called when a moving touch has a high velocity moving to the right.");
        docs.put("on-swipe-down","Called when a moving touch has a high velocity moving down.");
        docs.put("on-swipe-left","Called when a moving touch has a high velocity moving to the left.");
        docs.put("ion-header-bar","Adds a fixed header bar above some content.\n" +"\n" +
                "Can also be a subheader (lower down) if the 'bar-subheader' class is applied.");
        docs.put("ion-footer-bar","Adds a fixed footer bar below some content.\n" +"\n" +
                "Can also be a subfooter (higher up) if the 'bar-subfooter' class is applied");
        docs.put("ion-list","The List is a widely used interface element in almost any mobile app, and can include content ranging from basic text all the way to buttons, toggles, icons, and thumbnails.\n" +"\n" +
                "Both the list, which contains items, and the list items themselves can be any HTML element. The containing element requires the list class and each list item requires the item class.\n" +"\n" +
                "However, using the ionList and ionItem directives make it easy to support various interaction modes such as swipe to edit, drag to reorder, and removing items.");
        docs.put("ion-item","Child of ionList");
        docs.put("ion-delete-button","Child of ionItem");
        docs.put("ion-reorder-button","Child of ionItem");
        docs.put("ion-option-button","Child of ionItem\n" +"\n" +
                "Creates an option button inside a list item, that is visible when the item is swiped to the left by the user. Swiped open option buttons can be hidden with $ionicListDelegate#closeOptionButtons.\n" +"\n" +
                "Can be assigned any button class.\n" +"\n" +
                "See ionList for a complete example & explanation.");
        docs.put("collection-repeat","collection-repeat allows an app to show huge lists of items much more performantly than ng-repeat.\n" +"\n" +
                "It renders into the DOM only as many items as are currently visible.\n" +"\n" +
                "This means that on a phone screen that can fit eight items, only the eight items matching the current scroll position will be rendered.\n" +"\n" +
                "The Basics:\n" +"\n" +
                "The data given to collection-repeat must be an array.\n" +
                "If the item-height and item-width attributes are not supplied, it will be assumed that every item in the list has the same dimensions as the first item.\n" +
                "Don't use angular one-time binding (::) with collection-repeat. The scope of each item is assigned new data and re-digested as you scroll. Bindings need to update, and one-time bindings won't.\n" +
                "Performance Tips:\n" +
                "\n" +
                "The iOS webview has a performance bottleneck when switching out <img src> attributes. To increase performance of images on iOS, cache your images in advance and, if possible, lower the number of unique images. We're working on a solution.");
        docs.put("ion-modal-view","The Modal is a content pane that can go over the user's main view temporarily. Usually used for making a choice or editing an item.\n" +"\n" +
                "Put the content of the modal inside of an <ion-modal-view> element.\n" +"\n" +
                "Notes: - A modal will broadcast 'modal.shown', 'modal.hidden', and 'modal.removed' events from its originating scope, passing in itself as an event argument. Both the modal.removed and modal.hidden events are called when the modal is removed.\n" +"\n" +
                "This example assumes your modal is in your main index file or another template file. If it is in its own template file, remove the script tags and call it by file name.");
        docs.put("ion-nav-view","The ionNavView directive is used to render templates in your application. Each template is part of a state. States are usually mapped to a url, and are defined programatically using angular-ui-router (see their docs, and remember to replace ui-view with ion-nav-view in examples)");
        docs.put("ion-view","Child of ionNavView\n" +"\n" +
                "A container for view content and any navigational and header bar information. When a view enters and exits its parent ionNavView, the view also emits view information, such as its title, whether the back button should be displayed or not, whether the corresponding ionNavBar should be displayed or not, which transition the view should use to animate, and which direction to animate.\n" +"\n" +
                "Views are cached to improve performance. When a view is navigated away from, its element is left in the DOM, and its scope is disconnected from the $watch cycle. When navigating to a view that is already cached, its scope is reconnected, and the existing element, which was left in the DOM, becomes active again. This can be disabled, or the maximum number of cached views changed in $ionicConfigProvider, in the view's $state configuration, or as an attribute on the view itself ");
        docs.put("ion-nav-bar","If we have an ionNavView directive, we can also create an <ion-nav-bar>, which will create a topbar that updates as the application state changes.\n" +"\n" +
                "We can add a back button by putting an ionNavBackButton inside.\n" +"\n" +
                "We can add buttons depending on the currently visible view using ionNavButtons.\n" +"\n" +
                "Note that       the ion-nav-bar element will only work correctly if your content has an ionView around it.");
        docs.put("ion-nav-back-button","Child of ionNavBar\n" +"\n" +
                "Creates a back button inside an ionNavBar.\n" +"\n" +
                "The back button will appear when the user is able to go back in the current navigation stack. By default, the markup of the back button is automatically built using platform-appropriate defaults (iOS back button icon on iOS and Android icon on Android).\n" +"\n" +
                "Additionally, the button is automatically set to $ionicGoBack() on click/tap. By default, the app will navigate back one view when the back button is clicked. More advanced behavior is also possible, as outlined below.");
        docs.put("ion-nav-buttons","Child of ionNavView\n" +"\n" +
                "Use nav buttons to set the buttons on your ionNavBar from within an ionView. This gives each view template the ability to specify which buttons should show in the nav bar, overriding any default buttons already placed in the nav bar.\n" +"\n" +
                "Any buttons you declare will be positioned on the navbar's corresponding side. Primary buttons generally map to the left side of the header, and secondary buttons are generally on the right side. However, their exact locations are platform-specific. For example, in iOS, the primary buttons are on the far left of the header, and secondary buttons are on the far right, with the header title centered between them. For Android, however, both groups of buttons are on the far right of the header, with the header title aligned left.\n" +"\n" +
                "We recommend always using primary and secondary, so the buttons correctly map to the side familiar to users of each platform. However, in cases where buttons should always be on an exact side, both left and right sides are still available. For example, a toggle button for a left side menu should be on the left side; in this case, we'd recommend using side=\"left\", so it's always on the left, no matter the platform.\n" +"\n" +
                "Note that ion-nav-buttons must be immediate descendants of the ion-view or ion-nav-bar element (basically, don't wrap it in another div).");
        docs.put("ion-nav-title","The nav title directive replaces an ionNavBar title text with custom HTML from within an ionView template. This gives each view the ability to specify its own custom title element, such as an image or any HTML, rather than being text-only. Alternatively, text-only titles can be updated using the view-title ionView attribute.\n" +"\n" +
                "Note that ion-nav-title must be an immediate descendant of the ion-view or ion-nav-bar element (basically don't wrap it in another div).");
        docs.put("nav-transition","The transition type which the nav view transition should use when it animates. Current, options are ios, android, and none. More options coming soon.");
        docs.put("nav-direction","The direction which the nav view transition should animate. Available options are: forward, back, enter, exit, swap.");
        docs.put("ion-popover-view","The Popover is a view that floats above an app’s content. Popovers provide an easy way to present or gather information from the user and are commonly used in the following situations:\n" +"\n" +
                "Show more info about the current view\n" +
                "Select a commonly used tool or configuration\n" +
                "Present a list of actions to perform inside one of your views\n" +
                "Put the content of the popover inside of an <ion-popover-view> element.");
        docs.put("ion-scroll","Creates a scrollable container for all content inside.");
        docs.put("ion-infinite-scroll","The ionInfiniteScroll directive allows you to call a function whenever the user gets to the bottom of the page or near the bottom of the page.\n" +"\n" +
                "The expression you pass in for on-infinite is called when the user scrolls greater than distance away from the bottom of the content. Once on-infinite is done loading new data, it should broadcast the scroll.infiniteScrollComplete event from your controller ");
        docs.put("ion-side-menus","A container element for side menu(s) and the main content. Allows the left and/or right side menu to be toggled by dragging the main content area side to side.\n" +"\n" +
                "To automatically close an opened menu, you can add the menuClose attribute directive. The menu-close attribute is usually added to links and buttons within ion-side-menu-content, so that when the element is clicked, the opened side menu will automatically close.\n" +"\n" +
                "\"Burger Icon\" toggles can be added to the header with the menuToggle attribute directive. Clicking the toggle will open and close the side menu like the menu-close directive. The side menu will automatically hide on child pages, but can be overridden with the enable-menu-with-back-views attribute mentioned below.\n" +"\n" +
                "By default, side menus are hidden underneath their side menu content and can be opened by swiping the content left or right or by toggling a button to show the side menu. Additionally, by adding the exposeAsideWhen attribute directive to an ionSideMenu element directive, a side menu can be given instructions about \"when\" the menu should be exposed ");
        docs.put("ion-side-menu-content","A container for the main visible content, sibling to one or more ionSideMenu directives.");
        docs.put("ion-side-menu","A container for a side menu, sibling to an ionSideMenuContent directive.");
        docs.put("expose-aside-when","It is common for a tablet application to hide a menu when in portrait mode, but to show the same menu on the left side when the tablet is in landscape mode. The exposeAsideWhen attribute directive can be used to accomplish a similar interface.\n" +"\n" +
                "By default, side menus are hidden underneath its side menu content, and can be opened by either swiping the content left or right, or toggling a button to show the side menu. However, by adding the exposeAsideWhen attribute directive to an ionSideMenu element directive, a side menu can be given instructions on \"when\" the menu should be exposed (always viewable). For example, the expose-aside-when=\"large\" attribute will keep the side menu hidden when the viewport's width is less than 768px, but when the viewport's width is 768px or greater, the menu will then always be shown and can no longer be opened or closed like it could when it was hidden for smaller viewports.\n" +"\n" +
                "Using large as the attribute's value is a shortcut value to (min-width:768px) since it is the most common use-case. However, for added flexibility, any valid media query could be added as the value, such as (min-width:600px) or even multiple queries such as (min-width:750px) and (max-width:1200px)");
        docs.put("menu-toggle","Toggle a side menu on the given side.");
        docs.put("enable-menu-with-back-views","By default, the menu toggle button will only appear on a root level side-menu page. Navigating in to child views will hide the menu- toggle button. They can be made visible on child pages by setting the enable-menu-with-back-views attribute of the ionSideMenus directive to true.");
        docs.put("menu-close","menu-close is an attribute directive that closes a currently opened side menu. Note that by default, navigation transitions will not animate between views when the menu is open. Additionally, this directive will reset the entering view's history stack, making the new page the root of the history stack. This is done to replicate the user experience seen in most side menu implementations, which is to not show the back button at the root of the stack and show only the menu button. We recommend that you also use the enable-menu-with-back-views=\"false\" ionSideMenus attribute when using the menuClose directive.");
        docs.put("ion-slide-box","The Slide Box is a multi-page container where each page can be swiped or dragged between.");
        docs.put("ion-slide-pager","Shows a pager for the slidebox.\n" +"\n" +
                "A pager is a row of small buttons at the bottom of the slidebox, each representing one slide. When the user clicks a pager, that slide will be selected");
        docs.put("ion-slide","Displays a slide inside of a slidebox.");
        docs.put("ionSpinner","The ionSpinner directive provides a variety of animated spinners. Spinners enables you to give your users feedback that the app is processing/thinking/waiting/chillin' out, or whatever you'd like it to indicate. By default, the ionRefresher feature uses this spinner, rather than rotating font icons (previously included in ionicons). While font icons are great for simple or stationary graphics, they're not suited to provide great animations, which is why Ionic uses SVG instead.\n" +"\n" +
                "Ionic offers ten spinners out of the box, and by default, it will use the appropriate spinner for the platform on which it's running. Under the hood, the ionSpinner directive dynamically builds the required SVG element, which allows Ionic to provide all ten of the animated SVGs within 3KB");
        docs.put("ion-tabs","Powers a multi-tabbed interface with a Tab Bar and a set of \"pages\" that can be tabbed through.\n" +"\n" +
                "Assign any tabs class to the element to define its look and feel.\n" +"\n" +
                "For iOS, tabs will appear at the bottom of the screen. For Android, tabs will be at the top of the screen, below the nav-bar. This follows each OS's design specification, but can be configured with the $ionicConfigProvider.\n" +"\n" +
                "See the ionTab directive's documentation for more details on individual tabs.\n" +"\n" +
                "Note: do not place ion-tabs inside of an ion-content element; it has been known to cause a certain CSS bug.");
        docs.put("ion-tab","Contains a tab's content. The content only exists while the given tab is selected.\n" +"\n" +
                "Each ionTab has its own view history.");
                
    }
    public static String getDocs(String title){
        return docs.get(title);
    }
    
}
