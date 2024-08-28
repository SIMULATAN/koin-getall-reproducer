package me.simulatan.koin.getall

import org.koin.core.annotation.Single
import org.koin.dsl.koinApplication
import org.koin.ksp.generated.defaultModule

fun main() {
	koinApplication {
		defaultModule()

		koin.getAll<Resource>().forEach {
			it()
		}
	}
}

fun interface Resource {
	operator fun invoke()
}

@Single
fun firstResource() = Resource {
	println("First function resource")
}

@Single
fun secondResource() = Resource {
	println("Second function resource")
}

@Single
fun thirdResource() = Resource {
	println("Third function resource")
}

@Single
class FirstResource : Resource {
	override fun invoke() {
		println("First class resource")
	}
}

@Single
class SecondResource : Resource {
	override fun invoke() {
		println("Second class resource")
	}
}

// uncommenting this will render all other function based singletons useless!
/*
@Single
fun classBackedResource(): Resource = ClassBackedResource()
class ClassBackedResource : Resource {
	override fun invoke() {
		println("Class backed resource")
	}
}
*/
