package boot

import controllers.CommonControllers
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration()
@Import(value = CommonControllers::class)
class ApplicationConfiguration {
}