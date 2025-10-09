package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ListBullet: ImageVector
    get() {
        if (_ListBullet != null) {
            return _ListBullet!!
        }
        _ListBullet = ImageVector.Builder(
            name = "Filled.ListBullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.625f, 6.75f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
                moveTo(7.5f, 6.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 6f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(2.625f, 12f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
                moveTo(7.5f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                close()
                moveTo(2.625f, 17.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
                moveTo(7.5f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _ListBullet!!
    }

@Suppress("ObjectPropertyName")
private var _ListBullet: ImageVector? = null
