package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Slash: ImageVector
    get() {
        if (_Slash != null) {
            return _Slash!!
        }
        _Slash = ImageVector.Builder(
            name = "Filled.Slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.256f, 3.042f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.449f, 0.962f)
                lineToRelative(-6f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -0.513f)
                lineToRelative(6f, -16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.961f, -0.449f)
                close()
            }
        }.build()

        return _Slash!!
    }

@Suppress("ObjectPropertyName")
private var _Slash: ImageVector? = null
