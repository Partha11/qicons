package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) {
            return _UserCircle!!
        }
        _UserCircle = ImageVector.Builder(
            name = "Filled.UserCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.685f, 19.097f)
                arcTo(9.723f, 9.723f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 12f)
                curveToRelative(0f, -5.385f, -4.365f, -9.75f, -9.75f, -9.75f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                arcToRelative(9.723f, 9.723f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.065f, 7.097f)
                arcTo(9.716f, 9.716f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.75f)
                arcToRelative(9.716f, 9.716f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.685f, -2.653f)
                close()
                moveTo(6.145f, 17.812f)
                arcTo(7.486f, 7.486f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(7.486f, 7.486f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.855f, 2.812f)
                arcTo(8.224f, 8.224f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20.25f)
                arcToRelative(8.224f, 8.224f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.855f, -2.438f)
                close()
                moveTo(15.75f, 9f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 0f)
                close()
            }
        }.build()

        return _UserCircle!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircle: ImageVector? = null
