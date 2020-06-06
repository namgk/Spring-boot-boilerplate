package kyng.work.boilerplate.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity(name = "x")
@JsonIgnoreProperties(ignoreUnknown = true)
data class User (
    @Column(nullable = false, length = 100)
    val name: String,

    @Column(unique = true, length = 255)
    val email: String? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    val id: UUID? = null
){
    override fun equals(other: Any?): Boolean {
        return if (other is User){
            other.id == id
        } else {
            false
        }
    }
}
