package builder

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
class BankAccount private constructor(builder: Builder) {

    private var name: String? = null
    private var accountNumber: String? = null
    private var email: String? = null
    private var newsletter: Boolean = false

    init {
        this.name = builder.name
        this.accountNumber = builder.accountNumber
        this.email = builder.email
        this.newsletter = builder.newsletter
    }

    class Builder(name: String, accountNumber: String) {

        var name: String? = name
        var accountNumber: String? = accountNumber
        var email: String? = null
        var newsletter: Boolean = false

        fun withEmail(email: String): Builder {
            this.email = email
            return this
        }

        fun wantNewsletter(newsletter: Boolean): Builder {
            this.newsletter = newsletter
            return this
        }

        fun build(): BankAccount {
            return BankAccount(this)
        }

    }

    override fun toString(): String {
        return "BankAccount(name=$name, accountNumber=$accountNumber, email=$email, newsletter=$newsletter)"
    }

}