package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Divide: ImageVector
    get() {
        if (_Divide != null) {
            return _Divide!!
        }
        _Divide = ImageVector.Builder(
            name = "Filled.Divide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.874f, 5.248f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
                moveTo(3.749f, 11.998f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(10.874f, 18.751f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
            }
        }.build()

        return _Divide!!
    }

@Suppress("ObjectPropertyName")
private var _Divide: ImageVector? = null
