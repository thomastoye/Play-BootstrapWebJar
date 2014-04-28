package controllers;

import play.*;
import play.mvc.*;

import models.Order;
import play.data.Form;

import views.html.*;

public class Application extends Controller {

    public static final Form<Order> orderForm = Form.form(Order.class);

    public static Result index() {
        return ok(index.render("Your new application is ready.", orderForm));
    }

}
