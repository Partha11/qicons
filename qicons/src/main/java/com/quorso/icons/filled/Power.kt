package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Power: ImageVector
    get() {
        if (_Power != null) {
            return _Power!!
        }
        _Power = ImageVector.Builder(
            name = "Filled.Power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(6.166f, 5.106f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.668f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                curveToRelative(3.808f, 3.807f, 3.808f, 9.98f, 0f, 13.788f)
                curveToRelative(-3.807f, 3.808f, -9.98f, 3.808f, -13.788f, 0f)
                curveToRelative(-3.808f, -3.807f, -3.808f, -9.98f, 0f, -13.788f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                close()
            }
        }.build()

        return _Power!!
    }

@Suppress("ObjectPropertyName")
private var _Power: ImageVector? = null
